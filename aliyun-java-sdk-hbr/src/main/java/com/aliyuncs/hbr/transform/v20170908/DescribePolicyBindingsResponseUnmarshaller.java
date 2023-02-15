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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.DescribePolicyBindingsResponse;
import com.aliyuncs.hbr.model.v20170908.DescribePolicyBindingsResponse.Data;
import com.aliyuncs.hbr.model.v20170908.DescribePolicyBindingsResponse.Data.AdvancedOptions;
import com.aliyuncs.hbr.model.v20170908.DescribePolicyBindingsResponse.Data.AdvancedOptions.UdmDetail;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePolicyBindingsResponseUnmarshaller {

	public static DescribePolicyBindingsResponse unmarshall(DescribePolicyBindingsResponse describePolicyBindingsResponse, UnmarshallerContext _ctx) {
		
		describePolicyBindingsResponse.setRequestId(_ctx.stringValue("DescribePolicyBindingsResponse.RequestId"));
		describePolicyBindingsResponse.setNextToken(_ctx.stringValue("DescribePolicyBindingsResponse.NextToken"));
		describePolicyBindingsResponse.setMaxResults(_ctx.integerValue("DescribePolicyBindingsResponse.MaxResults"));
		describePolicyBindingsResponse.setTotalCount(_ctx.longValue("DescribePolicyBindingsResponse.TotalCount"));
		describePolicyBindingsResponse.setSuccess(_ctx.booleanValue("DescribePolicyBindingsResponse.Success"));
		describePolicyBindingsResponse.setCode(_ctx.stringValue("DescribePolicyBindingsResponse.Code"));
		describePolicyBindingsResponse.setMessage(_ctx.stringValue("DescribePolicyBindingsResponse.Message"));

		List<Data> policyBindings = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribePolicyBindingsResponse.PolicyBindings.Length"); i++) {
			Data data = new Data();
			data.setCreatedTime(_ctx.longValue("DescribePolicyBindingsResponse.PolicyBindings["+ i +"].CreatedTime"));
			data.setUpdatedTime(_ctx.longValue("DescribePolicyBindingsResponse.PolicyBindings["+ i +"].UpdatedTime"));
			data.setPolicyBindingId(_ctx.stringValue("DescribePolicyBindingsResponse.PolicyBindings["+ i +"].PolicyBindingId"));
			data.setPolicyBindingDescription(_ctx.stringValue("DescribePolicyBindingsResponse.PolicyBindings["+ i +"].PolicyBindingDescription"));
			data.setPolicyId(_ctx.stringValue("DescribePolicyBindingsResponse.PolicyBindings["+ i +"].PolicyId"));
			data.setDataSourceId(_ctx.stringValue("DescribePolicyBindingsResponse.PolicyBindings["+ i +"].DataSourceId"));
			data.setDisabled(_ctx.booleanValue("DescribePolicyBindingsResponse.PolicyBindings["+ i +"].Disabled"));
			data.setSource(_ctx.stringValue("DescribePolicyBindingsResponse.PolicyBindings["+ i +"].Source"));
			data.setInclude(_ctx.stringValue("DescribePolicyBindingsResponse.PolicyBindings["+ i +"].Include"));
			data.setExclude(_ctx.stringValue("DescribePolicyBindingsResponse.PolicyBindings["+ i +"].Exclude"));
			data.setSpeedLimit(_ctx.stringValue("DescribePolicyBindingsResponse.PolicyBindings["+ i +"].SpeedLimit"));
			data.setSourceType(_ctx.stringValue("DescribePolicyBindingsResponse.PolicyBindings["+ i +"].SourceType"));
			data.setCrossAccountType(_ctx.stringValue("DescribePolicyBindingsResponse.PolicyBindings["+ i +"].CrossAccountType"));
			data.setCrossAccountUserId(_ctx.longValue("DescribePolicyBindingsResponse.PolicyBindings["+ i +"].CrossAccountUserId"));
			data.setCrossAccountRoleName(_ctx.stringValue("DescribePolicyBindingsResponse.PolicyBindings["+ i +"].CrossAccountRoleName"));

			AdvancedOptions advancedOptions = new AdvancedOptions();

			UdmDetail udmDetail = new UdmDetail();
			udmDetail.setSnapshotGroup(_ctx.booleanValue("DescribePolicyBindingsResponse.PolicyBindings["+ i +"].AdvancedOptions.UdmDetail.SnapshotGroup"));
			udmDetail.setAppConsistent(_ctx.booleanValue("DescribePolicyBindingsResponse.PolicyBindings["+ i +"].AdvancedOptions.UdmDetail.AppConsistent"));
			udmDetail.setRamRoleName(_ctx.stringValue("DescribePolicyBindingsResponse.PolicyBindings["+ i +"].AdvancedOptions.UdmDetail.RamRoleName"));
			udmDetail.setPreScriptPath(_ctx.stringValue("DescribePolicyBindingsResponse.PolicyBindings["+ i +"].AdvancedOptions.UdmDetail.PreScriptPath"));
			udmDetail.setPostScriptPath(_ctx.stringValue("DescribePolicyBindingsResponse.PolicyBindings["+ i +"].AdvancedOptions.UdmDetail.PostScriptPath"));
			udmDetail.setEnableFsFreeze(_ctx.booleanValue("DescribePolicyBindingsResponse.PolicyBindings["+ i +"].AdvancedOptions.UdmDetail.EnableFsFreeze"));
			udmDetail.setTimeoutInSeconds(_ctx.longValue("DescribePolicyBindingsResponse.PolicyBindings["+ i +"].AdvancedOptions.UdmDetail.TimeoutInSeconds"));
			udmDetail.setEnableWriters(_ctx.booleanValue("DescribePolicyBindingsResponse.PolicyBindings["+ i +"].AdvancedOptions.UdmDetail.EnableWriters"));
			udmDetail.setDoBackup(_ctx.booleanValue("DescribePolicyBindingsResponse.PolicyBindings["+ i +"].AdvancedOptions.UdmDetail.DoBackup"));
			udmDetail.setBackupRetention(_ctx.longValue("DescribePolicyBindingsResponse.PolicyBindings["+ i +"].AdvancedOptions.UdmDetail.BackupRetention"));
			udmDetail.setBackupVaultId(_ctx.stringValue("DescribePolicyBindingsResponse.PolicyBindings["+ i +"].AdvancedOptions.UdmDetail.BackupVaultId"));
			udmDetail.setDiskIdMap(_ctx.mapValue("DescribePolicyBindingsResponse.PolicyBindings["+ i +"].AdvancedOptions.UdmDetail.DiskIdMap"));
			udmDetail.setExcludeDiskIdMap(_ctx.mapValue("DescribePolicyBindingsResponse.PolicyBindings["+ i +"].AdvancedOptions.UdmDetail.ExcludeDiskIdMap"));
			udmDetail.setGroupName(_ctx.stringValue("DescribePolicyBindingsResponse.PolicyBindings["+ i +"].AdvancedOptions.UdmDetail.GroupName"));

			List<String> excludeDiskIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribePolicyBindingsResponse.PolicyBindings["+ i +"].AdvancedOptions.UdmDetail.ExcludeDiskIdList.Length"); j++) {
				excludeDiskIdList.add(_ctx.stringValue("DescribePolicyBindingsResponse.PolicyBindings["+ i +"].AdvancedOptions.UdmDetail.ExcludeDiskIdList["+ j +"]"));
			}
			udmDetail.setExcludeDiskIdList(excludeDiskIdList);

			List<String> diskIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribePolicyBindingsResponse.PolicyBindings["+ i +"].AdvancedOptions.UdmDetail.DiskIdList.Length"); j++) {
				diskIdList.add(_ctx.stringValue("DescribePolicyBindingsResponse.PolicyBindings["+ i +"].AdvancedOptions.UdmDetail.DiskIdList["+ j +"]"));
			}
			udmDetail.setDiskIdList(diskIdList);
			advancedOptions.setUdmDetail(udmDetail);
			data.setAdvancedOptions(advancedOptions);

			policyBindings.add(data);
		}
		describePolicyBindingsResponse.setPolicyBindings(policyBindings);
	 
	 	return describePolicyBindingsResponse;
	}
}