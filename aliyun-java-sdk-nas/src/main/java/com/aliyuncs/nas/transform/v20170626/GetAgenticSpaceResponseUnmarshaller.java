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

import com.aliyuncs.nas.model.v20170626.GetAgenticSpaceResponse;
import com.aliyuncs.nas.model.v20170626.GetAgenticSpaceResponse.AgenticSpace;
import com.aliyuncs.nas.model.v20170626.GetAgenticSpaceResponse.AgenticSpace.Quota;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAgenticSpaceResponseUnmarshaller {

	public static GetAgenticSpaceResponse unmarshall(GetAgenticSpaceResponse getAgenticSpaceResponse, UnmarshallerContext _ctx) {
		
		getAgenticSpaceResponse.setRequestId(_ctx.stringValue("GetAgenticSpaceResponse.RequestId"));

		AgenticSpace agenticSpace = new AgenticSpace();
		agenticSpace.setFileSystemPath(_ctx.stringValue("GetAgenticSpaceResponse.AgenticSpace.FileSystemPath"));
		agenticSpace.setAzone(_ctx.stringValue("GetAgenticSpaceResponse.AgenticSpace.Azone"));
		agenticSpace.setStatus(_ctx.stringValue("GetAgenticSpaceResponse.AgenticSpace.Status"));
		agenticSpace.setDescription(_ctx.stringValue("GetAgenticSpaceResponse.AgenticSpace.Description"));
		agenticSpace.setSpaceUsage(_ctx.longValue("GetAgenticSpaceResponse.AgenticSpace.SpaceUsage"));
		agenticSpace.setFileSystemId(_ctx.stringValue("GetAgenticSpaceResponse.AgenticSpace.FileSystemId"));
		agenticSpace.setAgenticSpaceId(_ctx.stringValue("GetAgenticSpaceResponse.AgenticSpace.AgenticSpaceId"));
		agenticSpace.setUpdateTimeUtc(_ctx.stringValue("GetAgenticSpaceResponse.AgenticSpace.UpdateTimeUtc"));
		agenticSpace.setCreateTimeUtc(_ctx.stringValue("GetAgenticSpaceResponse.AgenticSpace.CreateTimeUtc"));
		agenticSpace.setFileCountUsage(_ctx.longValue("GetAgenticSpaceResponse.AgenticSpace.FileCountUsage"));

		Quota quota = new Quota();
		quota.setFileCountLimit(_ctx.longValue("GetAgenticSpaceResponse.AgenticSpace.Quota.FileCountLimit"));
		quota.setSizeLimit(_ctx.longValue("GetAgenticSpaceResponse.AgenticSpace.Quota.SizeLimit"));
		agenticSpace.setQuota(quota);
		getAgenticSpaceResponse.setAgenticSpace(agenticSpace);
	 
	 	return getAgenticSpaceResponse;
	}
}