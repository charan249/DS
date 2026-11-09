# Write your MySQL query statement below
select  Department,Employee,salary
from(
select Department.name as Department,Employee.name as Employee,Salary,
dense_rank() over(partition by Department.name order by salary desc) as temp
from Employee join Department
on Employee.departmentId=Department.id) as output
where temp=1;
