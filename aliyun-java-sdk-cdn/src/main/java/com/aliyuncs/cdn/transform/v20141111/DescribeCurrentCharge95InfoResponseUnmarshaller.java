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
package com.aliyuncs.cdn.transform.v20141111;

import com.aliyuncs.cdn.model.v20141111.DescribeCurrentCharge95InfoResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeCurrentCharge95InfoResponse.CurrentCharge95Info;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCurrentCharge95InfoResponseUnmarshaller {

	public static DescribeCurrentCharge95InfoResponse unmarshall(DescribeCurrentCharge95InfoResponse describeCurrentCharge95InfoResponse, UnmarshallerContext context) {
		
		describeCurrentCharge95InfoResponse.setRequestId(context.stringValue("DescribeCurrentCharge95InfoResponse.RequestId"));

		CurrentCharge95Info currentCharge95Info = new CurrentCharge95Info();
		currentCharge95Info.setMax95Bps(context.longValue("DescribeCurrentCharge95InfoResponse.CurrentCharge95Info.Max95Bps"));
		currentCharge95Info.setDomesticMax95Bps(context.longValue("DescribeCurrentCharge95InfoResponse.CurrentCharge95Info.DomesticMax95Bps"));
		currentCharge95Info.setOverseasMax95Bps(context.longValue("DescribeCurrentCharge95InfoResponse.CurrentCharge95Info.OverseasMax95Bps"));
		currentCharge95Info.setEffectiveFactor(context.floatValue("DescribeCurrentCharge95InfoResponse.CurrentCharge95Info.EffectiveFactor"));
		currentCharge95Info.setCost(context.floatValue("DescribeCurrentCharge95InfoResponse.CurrentCharge95Info.Cost"));
		currentCharge95Info.setUserName(context.stringValue("DescribeCurrentCharge95InfoResponse.CurrentCharge95Info.UserName"));
		describeCurrentCharge95InfoResponse.setCurrentCharge95Info(currentCharge95Info);
	 
	 	return describeCurrentCharge95InfoResponse;
	}
}