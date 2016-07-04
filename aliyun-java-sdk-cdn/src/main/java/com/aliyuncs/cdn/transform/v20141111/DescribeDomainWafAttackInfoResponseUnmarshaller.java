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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20141111.DescribeDomainWafAttackInfoResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainWafAttackInfoResponse.AttackDatas;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainWafAttackInfoResponseUnmarshaller {

	public static DescribeDomainWafAttackInfoResponse unmarshall(DescribeDomainWafAttackInfoResponse describeDomainWafAttackInfoResponse, UnmarshallerContext context) {
		
		describeDomainWafAttackInfoResponse.setRequestId(context.stringValue("DescribeDomainWafAttackInfoResponse.RequestId"));
		describeDomainWafAttackInfoResponse.setDomainName(context.stringValue("DescribeDomainWafAttackInfoResponse.DomainName"));
		describeDomainWafAttackInfoResponse.setStartTime(context.stringValue("DescribeDomainWafAttackInfoResponse.StartTime"));
		describeDomainWafAttackInfoResponse.setEndTime(context.stringValue("DescribeDomainWafAttackInfoResponse.EndTime"));
		describeDomainWafAttackInfoResponse.setPageNumber(context.integerValue("DescribeDomainWafAttackInfoResponse.PageNumber"));
		describeDomainWafAttackInfoResponse.setPageSize(context.integerValue("DescribeDomainWafAttackInfoResponse.PageSize"));

		List<AttackDatas> attackDataList = new ArrayList<AttackDatas>();
		for (int i = 0; i < context.lengthValue("DescribeDomainWafAttackInfoResponse.AttackDataList.Length"); i++) {
			AttackDatas attackDatas = new AttackDatas();
			attackDatas.setIp(context.stringValue("DescribeDomainWafAttackInfoResponse.AttackDataList["+ i +"].Ip"));
			attackDatas.setTime(context.stringValue("DescribeDomainWafAttackInfoResponse.AttackDataList["+ i +"].Time"));
			attackDatas.setUrl(context.stringValue("DescribeDomainWafAttackInfoResponse.AttackDataList["+ i +"].Url"));
			attackDatas.setType(context.stringValue("DescribeDomainWafAttackInfoResponse.AttackDataList["+ i +"].Type"));
			attackDatas.setResult(context.stringValue("DescribeDomainWafAttackInfoResponse.AttackDataList["+ i +"].Result"));

			attackDataList.add(attackDatas);
		}
		describeDomainWafAttackInfoResponse.setAttackDataList(attackDataList);
	 
	 	return describeDomainWafAttackInfoResponse;
	}
}