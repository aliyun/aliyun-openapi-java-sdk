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
package com.aliyuncs.rds.transform.v20140815;

import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceAttributeResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceAttributeResponse.DBInstanceAttribute;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceAttributeResponse.DBInstanceAttribute.AccountType;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceAttributeResponse.DBInstanceAttribute.ConnectionMode;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceAttributeResponse.DBInstanceAttribute.DBInstanceNetType;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceAttributeResponse.DBInstanceAttribute.DBInstanceStatus;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceAttributeResponse.DBInstanceAttribute.DBInstanceType;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceAttributeResponse.DBInstanceAttribute.LockMode;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceAttributeResponse.DBInstanceAttribute.ReadOnlyDBInstanceId;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceAttributeResponse.DBInstanceAttribute.SupportUpgradeAccountType;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;

public class DescribeDBInstanceAttributeResponseUnmarshaller {

    public static DescribeDBInstanceAttributeResponse unmarshall(
            DescribeDBInstanceAttributeResponse describeDBInstanceAttributeResponse,
            UnmarshallerContext context) {

        describeDBInstanceAttributeResponse
                .setRequestId(context.stringValue("DescribeDBInstanceAttributeResponse.RequestId"));

        List<DBInstanceAttribute> items = new ArrayList<DBInstanceAttribute>();
        for (int i = 0;
             i < context.lengthValue("DescribeDBInstanceAttributeResponse.Items.Length"); i++) {
            DBInstanceAttribute dBInstanceAttribute = new DBInstanceAttribute();
            dBInstanceAttribute.setInsId(context.integerValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].InsId"));
            dBInstanceAttribute.setDBInstanceId(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].DBInstanceId"));
            dBInstanceAttribute.setPayType(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].PayType"));
            dBInstanceAttribute.setDBInstanceClassType(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].DBInstanceClassType"));
            dBInstanceAttribute.setDBInstanceType(DBInstanceType.getEnum(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].DBInstanceType")));
            dBInstanceAttribute.setRegionId(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].RegionId"));
            dBInstanceAttribute.setConnectionString(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].ConnectionString"));
            dBInstanceAttribute.setPort(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].Port"));
            dBInstanceAttribute.setEngine(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].Engine"));
            dBInstanceAttribute.setEngineVersion(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].EngineVersion"));
            dBInstanceAttribute.setDBInstanceClass(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].DBInstanceClass"));
            dBInstanceAttribute.setDBInstanceMemory(context.longValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].DBInstanceMemory"));
            dBInstanceAttribute.setDBInstanceStorage(context.integerValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].DBInstanceStorage"));
            dBInstanceAttribute.setDBInstanceNetType(DBInstanceNetType.getEnum(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].DBInstanceNetType")));
            dBInstanceAttribute.setDBInstanceStatus(DBInstanceStatus.getEnum(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].DBInstanceStatus")));
            dBInstanceAttribute.setDBInstanceDescription(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].DBInstanceDescription"));
            dBInstanceAttribute.setLockMode(LockMode.getEnum(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].LockMode")));
            dBInstanceAttribute.setLockReason(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].LockReason"));
            dBInstanceAttribute.setReadDelayTime(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].ReadDelayTime"));
            dBInstanceAttribute.setDBMaxQuantity(context.integerValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].DBMaxQuantity"));
            dBInstanceAttribute.setAccountMaxQuantity(context.integerValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].AccountMaxQuantity"));
            dBInstanceAttribute.setCreationTime(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].CreationTime"));
            dBInstanceAttribute.setExpireTime(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].ExpireTime"));
            dBInstanceAttribute.setMaintainTime(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].MaintainTime"));
            dBInstanceAttribute.setAvailabilityValue(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].AvailabilityValue"));
            dBInstanceAttribute.setMaxIOPS(context.integerValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].MaxIOPS"));
            dBInstanceAttribute.setMaxConnections(context.integerValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].MaxConnections"));
            dBInstanceAttribute.setMasterInstanceId(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].MasterInstanceId"));
            dBInstanceAttribute.setDBInstanceCPU(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].DBInstanceCPU"));
            dBInstanceAttribute.setIncrementSourceDBInstanceId(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i
                            + "].IncrementSourceDBInstanceId"));
            dBInstanceAttribute.setGuardDBInstanceId(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].GuardDBInstanceId"));
            dBInstanceAttribute.setTempDBInstanceId(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].TempDBInstanceId"));
            dBInstanceAttribute.setSecurityIPList(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].SecurityIPList"));
            dBInstanceAttribute.setZoneId(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].ZoneId"));
            dBInstanceAttribute.setInstanceNetworkType(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].InstanceNetworkType"));
            dBInstanceAttribute.setAccountType(AccountType.getEnum(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].AccountType")));
            dBInstanceAttribute.setSupportUpgradeAccountType(SupportUpgradeAccountType.getEnum(
                    context.stringValue("DescribeDBInstanceAttributeResponse.Items[" + i
                            + "].SupportUpgradeAccountType")));
            dBInstanceAttribute.setVpcId(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].VpcId"));
            dBInstanceAttribute.setConnectionMode(ConnectionMode.getEnum(context.stringValue(
                    "DescribeDBInstanceAttributeResponse.Items[" + i + "].ConnectionMode")));

            List<ReadOnlyDBInstanceId> readOnlyDBInstanceIds = new ArrayList<ReadOnlyDBInstanceId>();
            for (int j = 0; j < context.lengthValue("DescribeDBInstanceAttributeResponse.Items[" + i
                    + "].ReadOnlyDBInstanceIds.Length"); j++) {
                ReadOnlyDBInstanceId readOnlyDBInstanceId = new ReadOnlyDBInstanceId();
                readOnlyDBInstanceId.setDBInstanceId(context.stringValue(
                        "DescribeDBInstanceAttributeResponse.Items[" + i
                                + "].ReadOnlyDBInstanceIds[" + j + "].DBInstanceId"));

                readOnlyDBInstanceIds.add(readOnlyDBInstanceId);
            }
            dBInstanceAttribute.setReadOnlyDBInstanceIds(readOnlyDBInstanceIds);

            items.add(dBInstanceAttribute);
        }
        describeDBInstanceAttributeResponse.setItems(items);

        return describeDBInstanceAttributeResponse;
    }
}
