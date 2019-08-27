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

import com.aliyuncs.emr.model.v20160408.GetBackInfoResponse;
import com.aliyuncs.emr.model.v20160408.GetBackInfoResponse.MetadataInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBackInfoResponseUnmarshaller {

	public static GetBackInfoResponse unmarshall(GetBackInfoResponse getBackInfoResponse, UnmarshallerContext _ctx) {
		
		getBackInfoResponse.setRequestId(_ctx.stringValue("GetBackInfoResponse.RequestId"));
		getBackInfoResponse.setPaging(_ctx.booleanValue("GetBackInfoResponse.Paging"));
		getBackInfoResponse.setId(_ctx.stringValue("GetBackInfoResponse.Id"));
		getBackInfoResponse.setBackupPlanId(_ctx.stringValue("GetBackInfoResponse.BackupPlanId"));
		getBackInfoResponse.setClusterId(_ctx.stringValue("GetBackInfoResponse.ClusterId"));
		getBackInfoResponse.setCreateTime(_ctx.longValue("GetBackInfoResponse.CreateTime"));
		getBackInfoResponse.setMd5(_ctx.stringValue("GetBackInfoResponse.Md5"));
		getBackInfoResponse.setTarFileName(_ctx.stringValue("GetBackInfoResponse.TarFileName"));
		getBackInfoResponse.setStorePath(_ctx.stringValue("GetBackInfoResponse.StorePath"));
		getBackInfoResponse.setStatus(_ctx.stringValue("GetBackInfoResponse.Status"));

		MetadataInfo metadataInfo = new MetadataInfo();
		metadataInfo.setMetadataType(_ctx.stringValue("GetBackInfoResponse.MetadataInfo.MetadataType"));
		metadataInfo.setProperties(_ctx.stringValue("GetBackInfoResponse.MetadataInfo.Properties"));
		getBackInfoResponse.setMetadataInfo(metadataInfo);
	 
	 	return getBackInfoResponse;
	}
}