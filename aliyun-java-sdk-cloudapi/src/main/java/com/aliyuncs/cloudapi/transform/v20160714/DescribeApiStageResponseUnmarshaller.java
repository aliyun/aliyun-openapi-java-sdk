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
package com.aliyuncs.cloudapi.transform.v20160714;

import com.aliyuncs.cloudapi.model.v20160714.DescribeApiStageResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiStageResponse.VariableItem;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;


public class DescribeApiStageResponseUnmarshaller {

	public static DescribeApiStageResponse unmarshall(DescribeApiStageResponse describeApiStageResponse, UnmarshallerContext context) {
		
		describeApiStageResponse.setRequestId(context.stringValue("DescribeApiStageResponse.RequestId"));
		describeApiStageResponse.setGroupId(context.stringValue("DescribeApiStageResponse.GroupId"));
		describeApiStageResponse.setStageId(context.stringValue("DescribeApiStageResponse.StageId"));
		describeApiStageResponse.setStageName(context.stringValue("DescribeApiStageResponse.StageName"));
		describeApiStageResponse.setDescription(context.stringValue("DescribeApiStageResponse.Description"));
		describeApiStageResponse.setCreatedTime(context.stringValue("DescribeApiStageResponse.CreatedTime"));
		describeApiStageResponse.setModifiedTime(context.stringValue("DescribeApiStageResponse.ModifiedTime"));

		List<VariableItem> variables = new ArrayList<VariableItem>();
		for (int i = 0; i < context.lengthValue("DescribeApiStageResponse.Variables.Length"); i++) {
			VariableItem variableItem = new VariableItem();
			variableItem.setVariableName(context.stringValue("DescribeApiStageResponse.Variables["+ i +"].VariableName"));
			variableItem.setVariableValue(context.stringValue("DescribeApiStageResponse.Variables["+ i +"].VariableValue"));

			variables.add(variableItem);
		}
		describeApiStageResponse.setVariables(variables);
	 
	 	return describeApiStageResponse;
	}
}