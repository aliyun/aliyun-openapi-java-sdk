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

package com.aliyuncs.nas.transform.v20170626;

import com.aliyuncs.nas.model.v20170626.GetFilesetResponse;
import com.aliyuncs.nas.model.v20170626.GetFilesetResponse.Data;
import com.aliyuncs.nas.model.v20170626.GetFilesetResponse.Data.Quota;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFilesetResponseUnmarshaller {

	public static GetFilesetResponse unmarshall(GetFilesetResponse getFilesetResponse, UnmarshallerContext _ctx) {
		
		getFilesetResponse.setRequestId(_ctx.stringValue("GetFilesetResponse.RequestId"));

		Data data = new Data();
		data.setFileSystemPath(_ctx.stringValue("GetFilesetResponse.Data.FileSystemPath"));
		data.setFsetId(_ctx.stringValue("GetFilesetResponse.Data.FsetId"));
		data.setStatus(_ctx.stringValue("GetFilesetResponse.Data.Status"));
		data.setDescription(_ctx.stringValue("GetFilesetResponse.Data.Description"));
		data.setSpaceUsage(_ctx.longValue("GetFilesetResponse.Data.SpaceUsage"));
		data.setCreateTime(_ctx.stringValue("GetFilesetResponse.Data.CreateTime"));
		data.setUpdateTime(_ctx.stringValue("GetFilesetResponse.Data.UpdateTime"));
		data.setFileSystemId(_ctx.stringValue("GetFilesetResponse.Data.FileSystemId"));
		data.setDeletionProtection(_ctx.booleanValue("GetFilesetResponse.Data.DeletionProtection"));
		data.setFileCountUsage(_ctx.longValue("GetFilesetResponse.Data.FileCountUsage"));

		Quota quota = new Quota();
		quota.setFileCountLimit(_ctx.longValue("GetFilesetResponse.Data.Quota.FileCountLimit"));
		quota.setSizeLimit(_ctx.longValue("GetFilesetResponse.Data.Quota.SizeLimit"));
		data.setQuota(quota);
		getFilesetResponse.setData(data);
	 
	 	return getFilesetResponse;
	}
}