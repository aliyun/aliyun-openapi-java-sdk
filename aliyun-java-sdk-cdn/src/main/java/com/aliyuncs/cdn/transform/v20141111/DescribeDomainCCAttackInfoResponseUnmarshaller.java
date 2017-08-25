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

import com.aliyuncs.cdn.model.v20141111.DescribeDomainCCAttackInfoResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainCCAttackInfoResponse.AttackIpDatas;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainCCAttackInfoResponse.AttackedUrlDatas;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainCCAttackInfoResponseUnmarshaller {

	public static DescribeDomainCCAttackInfoResponse unmarshall(DescribeDomainCCAttackInfoResponse describeDomainCCAttackInfoResponse, UnmarshallerContext context) {
		
		describeDomainCCAttackInfoResponse.setRequestId(context.stringValue("DescribeDomainCCAttackInfoResponse.RequestId"));
		describeDomainCCAttackInfoResponse.setDomainName(context.stringValue("DescribeDomainCCAttackInfoResponse.DomainName"));
		describeDomainCCAttackInfoResponse.setStartTime(context.stringValue("DescribeDomainCCAttackInfoResponse.StartTime"));
		describeDomainCCAttackInfoResponse.setEndTime(context.stringValue("DescribeDomainCCAttackInfoResponse.EndTime"));

		List<AttackIpDatas> attackIpDataList = new ArrayList<AttackIpDatas>();
		for (int i = 0; i < context.lengthValue("DescribeDomainCCAttackInfoResponse.AttackIpDataList.Length"); i++) {
			AttackIpDatas attackIpDatas = new AttackIpDatas();
			attackIpDatas.setIp(context.stringValue("DescribeDomainCCAttackInfoResponse.AttackIpDataList["+ i +"].Ip"));
			attackIpDatas.setAttackCount(context.stringValue("DescribeDomainCCAttackInfoResponse.AttackIpDataList["+ i +"].AttackCount"));
			attackIpDatas.setResult(context.stringValue("DescribeDomainCCAttackInfoResponse.AttackIpDataList["+ i +"].Result"));

			attackIpDataList.add(attackIpDatas);
		}
		describeDomainCCAttackInfoResponse.setAttackIpDataList(attackIpDataList);

		List<AttackedUrlDatas> attackedUrlDataList = new ArrayList<AttackedUrlDatas>();
		for (int i = 0; i < context.lengthValue("DescribeDomainCCAttackInfoResponse.AttackedUrlDataList.Length"); i++) {
			AttackedUrlDatas attackedUrlDatas = new AttackedUrlDatas();
			attackedUrlDatas.setUrl(context.stringValue("DescribeDomainCCAttackInfoResponse.AttackedUrlDataList["+ i +"].Url"));
			attackedUrlDatas.setAttackCount(context.stringValue("DescribeDomainCCAttackInfoResponse.AttackedUrlDataList["+ i +"].AttackCount"));
			attackedUrlDatas.setResult(context.stringValue("DescribeDomainCCAttackInfoResponse.AttackedUrlDataList["+ i +"].Result"));

			attackedUrlDataList.add(attackedUrlDatas);
		}
		describeDomainCCAttackInfoResponse.setAttackedUrlDataList(attackedUrlDataList);
	 
	 	return describeDomainCCAttackInfoResponse;
	}
}