/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeAccountsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.List;

/**
 * @author auto create
 */
public class DescribeAccountsResponse extends AcsResponse {

    private String requestId;

    private List<DBInstanceAccount> accounts;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<DBInstanceAccount> getAccounts() {
        return this.accounts;
    }

    public void setAccounts(List<DBInstanceAccount> accounts) {
        this.accounts = accounts;
    }

    public static class DBInstanceAccount {

        private String dBInstanceId;

        private String accountName;

        private AccountStatus accountStatus;

        private AccountType accountType;

        private String accountDescription;

        private List<DatabasePrivilege> databasePrivileges;

        public String getDBInstanceId() {
            return this.dBInstanceId;
        }

        public void setDBInstanceId(String dBInstanceId) {
            this.dBInstanceId = dBInstanceId;
        }

        public String getAccountName() {
            return this.accountName;
        }

        public void setAccountName(String accountName) {
            this.accountName = accountName;
        }

        public AccountStatus getAccountStatus() {
            return this.accountStatus;
        }

        public void setAccountStatus(AccountStatus accountStatus) {
            this.accountStatus = accountStatus;
        }

        public AccountType getAccountType() {
            return this.accountType;
        }

        public void setAccountType(AccountType accountType) {
            this.accountType = accountType;
        }

        public String getAccountDescription() {
            return this.accountDescription;
        }

        public void setAccountDescription(String accountDescription) {
            this.accountDescription = accountDescription;
        }

        public List<DatabasePrivilege> getDatabasePrivileges() {
            return this.databasePrivileges;
        }

        public void setDatabasePrivileges(List<DatabasePrivilege> databasePrivileges) {
            this.databasePrivileges = databasePrivileges;
        }

        public enum AccountStatus {

            AVAILABLE("Available"),
            UNAVAILABLE("Unavailable"),;

            private String stringValue;

            AccountStatus(String stringValue) {
                setStringValue(stringValue);
            }

            public String getStringValue() {
                return stringValue;
            }

            public void setStringValue(String stringValue) {
                this.stringValue = stringValue;
            }

            public static AccountStatus getEnum(String stringValue) {
                if (null == stringValue) {
                    return null;
                }

                for (AccountStatus accountStatus : AccountStatus.values()) {
                    if (accountStatus.getStringValue().equals(stringValue)) {
                        return accountStatus;
                    }
                }
                return null;
            }
        }

        public enum AccountType {

            NORMAL("Normal"),
            SUPER("Super"),;

            private String stringValue;

            AccountType(String stringValue) {
                setStringValue(stringValue);
            }

            public String getStringValue() {
                return stringValue;
            }

            public void setStringValue(String stringValue) {
                this.stringValue = stringValue;
            }

            public static AccountType getEnum(String stringValue) {
                if (null == stringValue) {
                    return null;
                }

                for (AccountType accountType : AccountType.values()) {
                    if (accountType.getStringValue().equals(stringValue)) {
                        return accountType;
                    }
                }
                return null;
            }
        }

        public static class DatabasePrivilege {

            private String dBName;

            private String accountPrivilege;

            public String getDBName() {
                return this.dBName;
            }

            public void setDBName(String dBName) {
                this.dBName = dBName;
            }

            public String getAccountPrivilege() {
                return this.accountPrivilege;
            }

            public void setAccountPrivilege(String accountPrivilege) {
                this.accountPrivilege = accountPrivilege;
            }
        }
    }

    @Override
    public DescribeAccountsResponse getInstance(UnmarshallerContext context) {
        return DescribeAccountsResponseUnmarshaller.unmarshall(this, context);
    }
}
