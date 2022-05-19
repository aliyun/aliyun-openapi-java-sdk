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

package com.aliyuncs.cr.transform.v20181201;

import com.aliyuncs.cr.model.v20181201.GetRepoBuildRecordResponse;
import com.aliyuncs.cr.model.v20181201.GetRepoBuildRecordResponse.Image;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRepoBuildRecordResponseUnmarshaller {

	public static GetRepoBuildRecordResponse unmarshall(GetRepoBuildRecordResponse getRepoBuildRecordResponse, UnmarshallerContext _ctx) {
		
		getRepoBuildRecordResponse.setRequestId(_ctx.stringValue("GetRepoBuildRecordResponse.RequestId"));
		getRepoBuildRecordResponse.setStatus(_ctx.stringValue("GetRepoBuildRecordResponse.Status"));
		getRepoBuildRecordResponse.setEndTime(_ctx.longValue("GetRepoBuildRecordResponse.EndTime"));
		getRepoBuildRecordResponse.setStartTime(_ctx.longValue("GetRepoBuildRecordResponse.StartTime"));
		getRepoBuildRecordResponse.setCode(_ctx.stringValue("GetRepoBuildRecordResponse.Code"));
		getRepoBuildRecordResponse.setIsSuccess(_ctx.booleanValue("GetRepoBuildRecordResponse.IsSuccess"));
		getRepoBuildRecordResponse.setBuildRecordId(_ctx.stringValue("GetRepoBuildRecordResponse.BuildRecordId"));

		Image image = new Image();
		image.setRepoNamespaceName(_ctx.stringValue("GetRepoBuildRecordResponse.Image.RepoNamespaceName"));
		image.setImageTag(_ctx.stringValue("GetRepoBuildRecordResponse.Image.ImageTag"));
		image.setRepoName(_ctx.stringValue("GetRepoBuildRecordResponse.Image.RepoName"));
		getRepoBuildRecordResponse.setImage(image);
	 
	 	return getRepoBuildRecordResponse;
	}
}