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

import com.aliyuncs.rds.model.v20140815.DescribeParametersResponse;
import com.aliyuncs.rds.model.v20140815.DescribeParametersResponse.DBInstanceParameter;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;

public class DescribeParametersResponseUnmarshaller {

    public static DescribeParametersResponse unmarshall(
            DescribeParametersResponse describeParametersResponse, UnmarshallerContext context) {

        describeParametersResponse
                .setRequestId(context.stringValue("DescribeParametersResponse.RequestId"));
        describeParametersResponse
                .setEngine(context.stringValue("DescribeParametersResponse.Engine"));
        describeParametersResponse
                .setEngineVersion(context.stringValue("DescribeParametersResponse.EngineVersion"));

        List<DBInstanceParameter> configParameters = new ArrayList<DBInstanceParameter>();
        for (int i = 0;
             i < context.lengthValue("DescribeParametersResponse.ConfigParameters.Length"); i++) {
            DBInstanceParameter dBInstanceParameter = new DBInstanceParameter();
            dBInstanceParameter.setParameterName(context.stringValue(
                    "DescribeParametersResponse.ConfigParameters[" + i + "].ParameterName"));
            dBInstanceParameter.setParameterValue(context.stringValue(
                    "DescribeParametersResponse.ConfigParameters[" + i + "].ParameterValue"));
            dBInstanceParameter.setParameterDescription(context.stringValue(
                    "DescribeParametersResponse.ConfigParameters[" + i + "].ParameterDescription"));

            configParameters.add(dBInstanceParameter);
        }
        describeParametersResponse.setConfigParameters(configParameters);

        List<DBInstanceParameter> runningParameters = new ArrayList<DBInstanceParameter>();
        for (int i = 0;
             i < context.lengthValue("DescribeParametersResponse.RunningParameters.Length"); i++) {
            DBInstanceParameter dBInstanceParameter = new DBInstanceParameter();
            dBInstanceParameter.setParameterName(context.stringValue(
                    "DescribeParametersResponse.RunningParameters[" + i + "].ParameterName"));
            dBInstanceParameter.setParameterValue(context.stringValue(
                    "DescribeParametersResponse.RunningParameters[" + i + "].ParameterValue"));
            dBInstanceParameter.setParameterDescription(context.stringValue(
                    "DescribeParametersResponse.RunningParameters[" + i
                            + "].ParameterDescription"));

            runningParameters.add(dBInstanceParameter);
        }
        describeParametersResponse.setRunningParameters(runningParameters);

        return describeParametersResponse;
    }
}
