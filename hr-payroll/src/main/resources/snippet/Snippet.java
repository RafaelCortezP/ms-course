package snippet;

public class Snippet {
	<?xml version="1.0" encoding="UTF-8"?>
	<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
		<modelVersion>4.0.0</modelVersion>
		<parent>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-parent</artifactId>
			<version>2.3.10.RELEASE</version>
			<relativePath/> <!-- lookup parent from repository -->
		</parent>
		<groupId>com.rafaelcortez</groupId>
		<artifactId>hr-payroll</artifactId>
		<version>0.0.1-SNAPSHOT</version>
		<name>hr-payroll</name>
		<description>Payroll Microservice</description>
		<properties>
			<java.version>11</java.version>
			<spring-cloud.version>Hoxton.SR11</spring-cloud.version>
		</properties>
		<dependencies>
			<dependency>
				<groupId>org.springframework.cloud</groupId>
				<artifactId>spring-cloud-starter-openfeign</artifactId>
			</dependency>
	
			<dependency>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-starter-test</artifactId>
				<scope>test</scope>
				<exclusions>
					<exclusion>
						<groupId>org.junit.vintage</groupId>
						<artifactId>junit-vintage-engine</artifactId>
					</exclusion>
				</exclusions>
			</dependency>
		</dependencies>
		<dependencyManagement>
			<dependencies>
				<dependency>
					<groupId>org.springframework.cloud</groupId>
					<artifactId>spring-cloud-dependencies</artifactId>
					<version>${spring-cloud.version}</version>
					<type>pom</type>
					<scope>import</scope>
				</dependency>
			</dependencies>
		</dependencyManagement>
	
		<build>
			<plugins>
				<plugin>
					<groupId>org.springframework.boot</groupId>
					<artifactId>spring-boot-maven-plugin</artifactId>
				</plugin>
			</plugins>
		</build>
	
	</project>
	
}

