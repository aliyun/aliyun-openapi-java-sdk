/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.DescribeCandidateInstanceListResponse;
import com.aliyuncs.drds.model.v20190123.DescribeCandidateInstanceListResponse.Data;
import com.aliyuncs.drds.model.v20190123.DescribeCandidateInstanceListResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCandidateInstanceListResponseUnmarshaller {

	public static DescribeCandidateInstanceListResponse unmarshall(DescribeCandidateInstanceListResponse describeCandidateInstanceListResponse, UnmarshallerContext context) {
		
		describeCandidateInstanceListResponse.setRequestId(context.stringValue("DescribeCandidateInstanceListResponse.RequestId"));
		describeCandidateInstanceListResponse.setSuccess(context.booleanValue("DescribeCandidateInstanceListResponse.Success"));

		Data data = new Data();
		data.setRegion(context.stringValue("DescribeCandidateInstanceListResponse.Data.Region"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < context.lengthValue("DescribeCandidateInstanceListResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setRegion(context.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].Region"));
			listItem.setInstanceId(context.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].InstanceId"));
			listItem.setInstanceName(context.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].InstanceName"));
			listItem.setInstanceDescription(context.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].InstanceDescription"));
			listItem.setIsAccountFull(context.booleanValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].IsAccountFull"));
			listItem.setAccountCount(context.integerValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].AccountCount"));
			listItem.setIsDbFull(context.booleanValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].IsDbFull"));
			listItem.setDbCount(context.integerValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].DbCount"));
			listItem.setSecurityIpList(context.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].SecurityIpList"));
			listItem.setSecurityIpListNotBlank(context.booleanValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].SecurityIpListNotBlank"));
			listItem.setIsInvalid(context.booleanValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].IsInvalid"));
			listItem.setInvalidReason(context.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].InvalidReason"));
			listItem.setInstanceNetType(context.integerValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].InstanceNetType"));
			listItem.setNetworkType(context.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].NetworkType"));
			listItem.setIsNetTypeNotSupport(context.booleanValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].IsNetTypeNotSupport"));
			listItem.setIsNetworkTypeNotSupport(context.booleanValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].IsNetworkTypeNotSupport"));
			listItem.setType(context.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].Type"));
			listItem.setConnectUrl(context.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].ConnectUrl"));
			listItem.setPort(context.integerValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].Port"));
			listItem.setStatus(context.integerValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].Status"));
			listItem.setReadWeight(context.integerValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].ReadWeight"));
			listItem.setMaxAccountCount(context.integerValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].MaxAccountCount"));
			listItem.setMaxDbCount(context.integerValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].MaxDbCount"));
			listItem.setSubDomain(context.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].SubDomain"));
			listItem.setAvz(context.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].Avz"));
			listItem.setAzoneIdNotMatch(context.booleanValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].AzoneIdNotMatch"));
			listItem.setRegionName(context.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].RegionName"));
			listItem.setAccountType(context.integerValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].AccountType"));
			listItem.setSupportUpgradeAccountType(context.integerValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].SupportUpgradeAccountType"));
			listItem.setIsAccountTypeNotSupport(context.booleanValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].IsAccountTypeNotSupport"));
			listItem.setMaxConnections(context.integerValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].MaxConnections"));
			listItem.setLockMode(context.integerValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].LockMode"));
			listItem.setDbInstanceMemory(context.longValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].DbInstanceMemory"));
			listItem.setDbInstanceStorage(context.integerValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].DbInstanceStorage"));
			listItem.setVpcId(context.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].VpcId"));
			listItem.setVswitchId(context.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].VswitchId"));
			listItem.setUsingNatIp(context.booleanValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].UsingNatIp"));
			listItem.setInstanceStorage(context.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].InstanceStorage"));
			listItem.setEngine(context.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].Engine"));
			listItem.setEngineVersion(context.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].EngineVersion"));
			listItem.setAdminUser(context.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].AdminUser"));
			listItem.setAdminPwd(context.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].AdminPwd"));
			listItem.setVpcCloudDbInstanceId(context.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].VpcCloudDbInstanceId"));
			listItem.setCategory(context.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].Category"));
			listItem.setDBInstanceStorageType(context.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].DBInstanceStorageType"));

			list.add(listItem);
		}
		data.setList(list);
		describeCandidateInstanceListResponse.setData(data);
	 
	 	return describeCandidateInstanceListResponse;
	}
}