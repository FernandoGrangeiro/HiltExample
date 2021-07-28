print_blue() {
    echo "\e[1;34m$1\e[0m"
}


cd ..

print_blue "\nAssemble... \n"
./gradlew assemble

print_blue " Apk to Output"

