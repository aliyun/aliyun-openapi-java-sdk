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

	public static DescribeCandidateInstanceListResponse unmarshall(DescribeCandidateInstanceListResponse describeCandidateInstanceListResponse, UnmarshallerContext _ctx) {
		
		describeCandidateInstanceListResponse.setRequestId(_ctx.stringValue("DescribeCandidateInstanceListResponse.RequestId"));
		describeCandidateInstanceListResponse.setSuccess(_ctx.booleanValue("DescribeCandidateInstanceListResponse.Success"));

		Data data = new Data();
		data.setRegion(_ctx.stringValue("DescribeCandidateInstanceListResponse.Data.Region"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCandidateInstanceListResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setRegion(_ctx.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].Region"));
			listItem.setInstanceId(_ctx.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].InstanceId"));
			listItem.setInstanceName(_ctx.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].InstanceName"));
			listItem.setInstanceDescription(_ctx.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].InstanceDescription"));
			listItem.setIsAccountFull(_ctx.booleanValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].IsAccountFull"));
			listItem.setAccountCount(_ctx.integerValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].AccountCount"));
			listItem.setIsDbFull(_ctx.booleanValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].IsDbFull"));
			listItem.setDbCount(_ctx.integerValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].DbCount"));
			listItem.setSecurityIpList(_ctx.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].SecurityIpList"));
			listItem.setSecurityIpListNotBlank(_ctx.booleanValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].SecurityIpListNotBlank"));
			listItem.setIsInvalid(_ctx.booleanValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].IsInvalid"));
			listItem.setInvalidReason(_ctx.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].InvalidReason"));
			listItem.setInstanceNetType(_ctx.integerValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].InstanceNetType"));
			listItem.setNetworkType(_ctx.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].NetworkType"));
			listItem.setIsNetTypeNotSupport(_ctx.booleanValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].IsNetTypeNotSupport"));
			listItem.setIsNetworkTypeNotSupport(_ctx.booleanValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].IsNetworkTypeNotSupport"));
			listItem.setType(_ctx.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].Type"));
			listItem.setConnectUrl(_ctx.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].ConnectUrl"));
			listItem.setPort(_ctx.integerValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].Port"));
			listItem.setStatus(_ctx.integerValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].Status"));
			listItem.setReadWeight(_ctx.integerValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].ReadWeight"));
			listItem.setMaxAccountCount(_ctx.integerValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].MaxAccountCount"));
			listItem.setMaxDbCount(_ctx.integerValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].MaxDbCount"));
			listItem.setSubDomain(_ctx.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].SubDomain"));
			listItem.setAvz(_ctx.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].Avz"));
			listItem.setAzoneIdNotMatch(_ctx.booleanValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].AzoneIdNotMatch"));
			listItem.setRegionName(_ctx.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].RegionName"));
			listItem.setAccountType(_ctx.integerValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].AccountType"));
			listItem.setSupportUpgradeAccountType(_ctx.integerValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].SupportUpgradeAccountType"));
			listItem.setIsAccountTypeNotSupport(_ctx.booleanValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].IsAccountTypeNotSupport"));
			listItem.setMaxConnections(_ctx.integerValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].MaxConnections"));
			listItem.setLockMode(_ctx.integerValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].LockMode"));
			listItem.setDbInstanceMemory(_ctx.longValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].DbInstanceMemory"));
			listItem.setDbInstanceStorage(_ctx.integerValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].DbInstanceStorage"));
			listItem.setVpcId(_ctx.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].VpcId"));
			listItem.setVswitchId(_ctx.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].VswitchId"));
			listItem.setUsingNatIp(_ctx.booleanValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].UsingNatIp"));
			listItem.setInstanceStorage(_ctx.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].InstanceStorage"));
			listItem.setEngine(_ctx.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].Engine"));
			listItem.setEngineVersion(_ctx.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].EngineVersion"));
			listItem.setAdminUser(_ctx.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].AdminUser"));
			listItem.setAdminPwd(_ctx.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].AdminPwd"));
			listItem.setVpcCloudDbInstanceId(_ctx.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].VpcCloudDbInstanceId"));
			listItem.setCategory(_ctx.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].Category"));
			listItem.setDBInstanceStorageType(_ctx.stringValue("DescribeCandidateInstanceListResponse.Data.List["+ i +"].DBInstanceStorageType"));

			list.add(listItem);
		}
		data.setList(list);
		describeCandidateInstanceListResponse.setData(data);
	 
	 	return describeCandidateInstanceListResponse;
	}
}