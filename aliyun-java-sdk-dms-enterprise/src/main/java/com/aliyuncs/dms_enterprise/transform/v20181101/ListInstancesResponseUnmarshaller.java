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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.ListInstancesResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListInstancesResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstancesResponseUnmarshaller {

	public static ListInstancesResponse unmarshall(ListInstancesResponse listInstancesResponse, UnmarshallerContext _ctx) {
		
		listInstancesResponse.setRequestId(_ctx.stringValue("ListInstancesResponse.RequestId"));
		listInstancesResponse.setTotalCount(_ctx.longValue("ListInstancesResponse.TotalCount"));
		listInstancesResponse.setErrorCode(_ctx.stringValue("ListInstancesResponse.ErrorCode"));
		listInstancesResponse.setErrorMessage(_ctx.stringValue("ListInstancesResponse.ErrorMessage"));
		listInstancesResponse.setSuccess(_ctx.booleanValue("ListInstancesResponse.Success"));

		List<Instance> instanceList = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("ListInstancesResponse.InstanceList.Length"); i++) {
			Instance instance = new Instance();
			instance.setInstanceSource(_ctx.stringValue("ListInstancesResponse.InstanceList["+ i +"].InstanceSource"));
			instance.setInstanceId(_ctx.stringValue("ListInstancesResponse.InstanceList["+ i +"].InstanceId"));
			instance.setDatabasePassword(_ctx.stringValue("ListInstancesResponse.InstanceList["+ i +"].DatabasePassword"));
			instance.setPort(_ctx.integerValue("ListInstancesResponse.InstanceList["+ i +"].Port"));
			instance.setHost(_ctx.stringValue("ListInstancesResponse.InstanceList["+ i +"].Host"));
			instance.setExportTimeout(_ctx.integerValue("ListInstancesResponse.InstanceList["+ i +"].ExportTimeout"));
			instance.setDdlOnline(_ctx.integerValue("ListInstancesResponse.InstanceList["+ i +"].DdlOnline"));
			instance.setEnvType(_ctx.stringValue("ListInstancesResponse.InstanceList["+ i +"].EnvType"));
			instance.setSid(_ctx.stringValue("ListInstancesResponse.InstanceList["+ i +"].Sid"));
			instance.setUseDsql(_ctx.integerValue("ListInstancesResponse.InstanceList["+ i +"].UseDsql"));
			instance.setEcsInstanceId(_ctx.stringValue("ListInstancesResponse.InstanceList["+ i +"].EcsInstanceId"));
			instance.setDbaId(_ctx.stringValue("ListInstancesResponse.InstanceList["+ i +"].DbaId"));
			instance.setVpcId(_ctx.stringValue("ListInstancesResponse.InstanceList["+ i +"].VpcId"));
			instance.setEcsRegion(_ctx.stringValue("ListInstancesResponse.InstanceList["+ i +"].EcsRegion"));
			instance.setInstanceAlias(_ctx.stringValue("ListInstancesResponse.InstanceList["+ i +"].InstanceAlias"));
			instance.setState(_ctx.stringValue("ListInstancesResponse.InstanceList["+ i +"].State"));
			instance.setDatabaseUser(_ctx.stringValue("ListInstancesResponse.InstanceList["+ i +"].DatabaseUser"));
			instance.setInstanceType(_ctx.stringValue("ListInstancesResponse.InstanceList["+ i +"].InstanceType"));
			instance.setDbaNickName(_ctx.stringValue("ListInstancesResponse.InstanceList["+ i +"].DbaNickName"));
			instance.setDataLinkName(_ctx.stringValue("ListInstancesResponse.InstanceList["+ i +"].DataLinkName"));
			instance.setQueryTimeout(_ctx.integerValue("ListInstancesResponse.InstanceList["+ i +"].QueryTimeout"));
			instance.setSafeRuleId(_ctx.stringValue("ListInstancesResponse.InstanceList["+ i +"].SafeRuleId"));

			List<String> ownerNameList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListInstancesResponse.InstanceList["+ i +"].OwnerNameList.Length"); j++) {
				ownerNameList.add(_ctx.stringValue("ListInstancesResponse.InstanceList["+ i +"].OwnerNameList["+ j +"]"));
			}
			instance.setOwnerNameList(ownerNameList);

			List<String> ownerIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListInstancesResponse.InstanceList["+ i +"].OwnerIdList.Length"); j++) {
				ownerIdList.add(_ctx.stringValue("ListInstancesResponse.InstanceList["+ i +"].OwnerIdList["+ j +"]"));
			}
			instance.setOwnerIdList(ownerIdList);

			instanceList.add(instance);
		}
		listInstancesResponse.setInstanceList(instanceList);
	 
	 	return listInstancesResponse;
	}
}