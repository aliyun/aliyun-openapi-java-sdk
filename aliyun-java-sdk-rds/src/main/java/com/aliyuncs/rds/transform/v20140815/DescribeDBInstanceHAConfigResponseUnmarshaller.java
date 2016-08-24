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

import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceHAConfigResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceHAConfigResponse.NodeInfo;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;

public class DescribeDBInstanceHAConfigResponseUnmarshaller {

    public static DescribeDBInstanceHAConfigResponse unmarshall(
            DescribeDBInstanceHAConfigResponse describeDBInstanceHAConfigResponse,
            UnmarshallerContext context) {

        describeDBInstanceHAConfigResponse
                .setRequestId(context.stringValue("DescribeDBInstanceHAConfigResponse.RequestId"));
        describeDBInstanceHAConfigResponse.setDBInstanceId(
                context.stringValue("DescribeDBInstanceHAConfigResponse.DBInstanceId"));
        describeDBInstanceHAConfigResponse
                .setSyncMode(context.stringValue("DescribeDBInstanceHAConfigResponse.SyncMode"));
        describeDBInstanceHAConfigResponse
                .setHAMode(context.stringValue("DescribeDBInstanceHAConfigResponse.HAMode"));

        List<NodeInfo> hostInstanceInfos = new ArrayList<NodeInfo>();
        for (int i = 0; i < context
                .lengthValue("DescribeDBInstanceHAConfigResponse.HostInstanceInfos.Length"); i++) {
            NodeInfo nodeInfo = new NodeInfo();
            nodeInfo.setNodeId(context.stringValue(
                    "DescribeDBInstanceHAConfigResponse.HostInstanceInfos[" + i + "].NodeId"));
            nodeInfo.setRegionId(context.stringValue(
                    "DescribeDBInstanceHAConfigResponse.HostInstanceInfos[" + i + "].RegionId"));
            nodeInfo.setLogSyncTime(context.stringValue(
                    "DescribeDBInstanceHAConfigResponse.HostInstanceInfos[" + i + "].LogSyncTime"));
            nodeInfo.setDataSyncTime(context.stringValue(
                    "DescribeDBInstanceHAConfigResponse.HostInstanceInfos[" + i
                            + "].DataSyncTime"));
            nodeInfo.setNodeType(context.stringValue(
                    "DescribeDBInstanceHAConfigResponse.HostInstanceInfos[" + i + "].NodeType"));
            nodeInfo.setZoneId(context.stringValue(
                    "DescribeDBInstanceHAConfigResponse.HostInstanceInfos[" + i + "].ZoneId"));
            nodeInfo.setSyncStatus(context.stringValue(
                    "DescribeDBInstanceHAConfigResponse.HostInstanceInfos[" + i + "].SyncStatus"));

            hostInstanceInfos.add(nodeInfo);
        }
        describeDBInstanceHAConfigResponse.setHostInstanceInfos(hostInstanceInfos);

        return describeDBInstanceHAConfigResponse;
    }
}
