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

package com.aliyuncs.emr.transform.v20160408;

import com.aliyuncs.emr.model.v20160408.GetBackupInfoResponse;
import com.aliyuncs.emr.model.v20160408.GetBackupInfoResponse.MetadataInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBackupInfoResponseUnmarshaller {

	public static GetBackupInfoResponse unmarshall(GetBackupInfoResponse getBackupInfoResponse, UnmarshallerContext _ctx) {
		
		getBackupInfoResponse.setRequestId(_ctx.stringValue("GetBackupInfoResponse.RequestId"));
		getBackupInfoResponse.setId(_ctx.stringValue("GetBackupInfoResponse.Id"));
		getBackupInfoResponse.setBackupPlanId(_ctx.stringValue("GetBackupInfoResponse.BackupPlanId"));
		getBackupInfoResponse.setClusterId(_ctx.stringValue("GetBackupInfoResponse.ClusterId"));
		getBackupInfoResponse.setCreateTime(_ctx.longValue("GetBackupInfoResponse.CreateTime"));
		getBackupInfoResponse.setMd5(_ctx.stringValue("GetBackupInfoResponse.Md5"));
		getBackupInfoResponse.setTarFileName(_ctx.stringValue("GetBackupInfoResponse.TarFileName"));
		getBackupInfoResponse.setStorePath(_ctx.stringValue("GetBackupInfoResponse.StorePath"));
		getBackupInfoResponse.setStatus(_ctx.stringValue("GetBackupInfoResponse.Status"));

		MetadataInfo metadataInfo = new MetadataInfo();
		metadataInfo.setMetadataType(_ctx.stringValue("GetBackupInfoResponse.MetadataInfo.MetadataType"));
		metadataInfo.setProperties(_ctx.stringValue("GetBackupInfoResponse.MetadataInfo.Properties"));
		getBackupInfoResponse.setMetadataInfo(metadataInfo);
	 
	 	return getBackupInfoResponse;
	}
}