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
package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeStratetyResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeStratetyResponse.Data;
import com.aliyuncs.aegis.model.v20161111.DescribeStratetyResponse.Data.ConfigTarget;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStratetyResponseUnmarshaller {

	public static DescribeStratetyResponse unmarshall(DescribeStratetyResponse describeStratetyResponse, UnmarshallerContext context) {
		
		describeStratetyResponse.setRequestId(context.stringValue("DescribeStratetyResponse.RequestId"));
		describeStratetyResponse.setCount(context.integerValue("DescribeStratetyResponse.Count"));

		List<Data> strategies = new ArrayList<Data>();
		for (int i = 0; i < context.lengthValue("DescribeStratetyResponse.Strategies.Length"); i++) {
			Data data = new Data();
			data.setCycleDays(context.integerValue("DescribeStratetyResponse.Strategies["+ i +"].CycleDays"));
			data.setId(context.integerValue("DescribeStratetyResponse.Strategies["+ i +"].Id"));
			data.setCycleStartTime(context.integerValue("DescribeStratetyResponse.Strategies["+ i +"].CycleStartTime"));
			data.setType(context.integerValue("DescribeStratetyResponse.Strategies["+ i +"].Type"));
			data.setName(context.stringValue("DescribeStratetyResponse.Strategies["+ i +"].Name"));
			data.setRiskCount(context.integerValue("DescribeStratetyResponse.Strategies["+ i +"].RiskCount"));
			data.setEcsCount(context.integerValue("DescribeStratetyResponse.Strategies["+ i +"].EcsCount"));

			List<ConfigTarget> configTargets = new ArrayList<ConfigTarget>();
			for (int j = 0; j < context.lengthValue("DescribeStratetyResponse.Strategies["+ i +"].ConfigTargets.Length"); j++) {
				ConfigTarget configTarget = new ConfigTarget();
				configTarget.setFlag(context.stringValue("DescribeStratetyResponse.Strategies["+ i +"].ConfigTargets["+ j +"].Flag"));
				configTarget.setTargetType(context.stringValue("DescribeStratetyResponse.Strategies["+ i +"].ConfigTargets["+ j +"].TargetType"));
				configTarget.setTarget(context.stringValue("DescribeStratetyResponse.Strategies["+ i +"].ConfigTargets["+ j +"].Target"));

				configTargets.add(configTarget);
			}
			data.setConfigTargets(configTargets);

			strategies.add(data);
		}
		describeStratetyResponse.setStrategies(strategies);
	 
	 	return describeStratetyResponse;
	}
}