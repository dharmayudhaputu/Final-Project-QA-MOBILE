<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>1 Test Suite Login dan Register</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>374e27cc-7ae4-4fb3-b3bf-fca9cc2985f3</testSuiteGuid>
   <testCaseLink>
      <guid>8598e134-b790-48e2-a8f0-df08a4e8d2dd</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/1 Positive Test Case/1 Register Account</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>4dd0eb18-4fca-4134-acf6-9854775b93a0</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/1 Positive Test Case/2 Login - IF ELSE dan Data Driven</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>4d91bf39-a8b6-4cce-be94-0b4b0255be8a</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/1 Data Login</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>4d91bf39-a8b6-4cce-be94-0b4b0255be8a</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>username</value>
         <variableId>83a4ecda-d120-4d56-9025-e514b7c4805f</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>4d91bf39-a8b6-4cce-be94-0b4b0255be8a</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>0e16f262-204a-4995-8cbf-463cc2757289</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
