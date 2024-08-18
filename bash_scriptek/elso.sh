#!/bin/bash

name="Ádám"

#echo "Kérem adja meg a nevét: "
# read -p "Kérem adja meg a nevét: " name
my_array1=( "value1" "value2" "value3" )
my_array2=("a""b""c""d""e")
# echo "Hello ${name}!"

lista=($(ls ~))

# echo "${lista[0]} ${lista[1]} ${lista[2]}"
# echo ${lista}
# for item in ${lista[@]} 
# do
#     echo $item
# done

# for num in {1..10}
# do
#     touch file${num}.txt
# done

read -p "What is your name? " car
while [[ -z ${car} ]]
do
echo "Your name can not be blank. Please enter a valid
name!"
read -p "Enter your name again? " car
done

# if [[ "${name}" != "${admin}" ]] || [[ $EUID != 1000 ]] ;
# then
# echo "You are not the admin or root user, but please be
# safe!"
# else
# echo "You are the admin user! This could be very
# destructive!"
# fi

case $car in
    Tesla)
        echo -n "${car}'s car factory is in the USA."
        ;;
    BMW | Mercedes | Audi | Porsche)
        echo -n "${car}'s car factory is in Germany."
        ;;
    Toyota | Mazda | Mitsubishi | Subaru)
        echo -n "${car}'s car factory is in Japan."
        ;;
    *)
        echo -n "${car} is an unknown car brand"
        ;;
esac
echo 



# File test operators
#
# True if file exists.
# [[ -a ${file} ]]
# True if file exists and is a block special file.
# [[ -b ${file} ]]
# True if file exists and is a character special file.
# [[ -c ${file} ]]
# True if file exists and is a directory.
# [[ -d ${file} ]]
# True if file exists.
# [[ -e ${file} ]]
# True if file exists and is a regular file.
# [[ -f ${file} ]]
# True if file exists and is a symbolic link.
# [[ -h ${file} ]]
# True if file exists and is readable.
# [[ -r ${file} ]]
# True if file exists and has a size greater than zero.
# [[ -s ${file} ]]
# True if file exists and is writable.
# [[ -w ${file} ]]
# True if file exists and is executable.
# [[ -x ${file} ]]
# True if file exists and is a symbolic link.
# [[ -L ${file} ]]


# String expressions

# True if the shell variable varname is set (has been assigned a value).
# [[ -v ${varname} ]]
# True if the length of the string is zero.
# [[ -z ${string} ]]
# True if the length of the string is non-zero.
# [[ -n ${string} ]]

# True if the strings are equal. = should be used with the test command for POSIX
# conformance. When used with the [[ command, this performs pattern matching
# as described above (Compound Commands).
# [[ ${string1} == ${string2} ]]
# True if the strings are not equal.
# [[ ${string1} != ${string2} ]]
# True if string1 sorts before string2 lexicographically.
# [[ ${string1} < ${string2} ]]
# True if string1 sorts after string2 lexicographically.
# [[ ${string1} > ${string2} ]]

# Arithmetic operators

# Returns true if the numbers are equal
# [[ ${arg1} -eq ${arg2} ]]
# Returns true if the numbers are not equal
# [[ ${arg1} -ne ${arg2} ]]
# Returns true if arg1 is less than arg2
# [[ ${arg1} -lt ${arg2} ]]
# Returns true if arg1 is less than or equal arg2
# [[ ${arg1} -le ${arg2} ]]
# Returns true if arg1 is greater than arg2
# [[ ${arg1} -gt ${arg2} ]]
# Returns true if arg1 is greater than or equal arg2
# [[ ${arg1} -ge ${arg2} ]]