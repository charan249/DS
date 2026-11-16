# Write your MySQL query statement below
select department as Department, name as Employee ,salary
from(
select Employee.name as name ,Employee.salary,Department.name as department,
dense_rank() over(partition by departmentId order by salary desc) as temp
from Employee join Department
on Employee.departmentId=Department.id) as new
where temp=1;
