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

package com.aliyuncs.dataphin_public.transform.v20230630;

import com.aliyuncs.dataphin_public.model.v20230630.GetLatestSubmitDetailResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetLatestSubmitDetailResponse.SubmitDetailResult;
import com.aliyuncs.dataphin_public.model.v20230630.GetLatestSubmitDetailResponse.SubmitDetailResult.ReleaseObject;
import com.aliyuncs.dataphin_public.model.v20230630.GetLatestSubmitDetailResponse.SubmitDetailResult.ReleaseObject.SubmitObject;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLatestSubmitDetailResponseUnmarshaller {

	public static GetLatestSubmitDetailResponse unmarshall(GetLatestSubmitDetailResponse getLatestSubmitDetailResponse, UnmarshallerContext _ctx) {
		
		getLatestSubmitDetailResponse.setRequestId(_ctx.stringValue("GetLatestSubmitDetailResponse.RequestId"));
		getLatestSubmitDetailResponse.setSuccess(_ctx.booleanValue("GetLatestSubmitDetailResponse.Success"));
		getLatestSubmitDetailResponse.setHttpStatusCode(_ctx.integerValue("GetLatestSubmitDetailResponse.HttpStatusCode"));
		getLatestSubmitDetailResponse.setCode(_ctx.stringValue("GetLatestSubmitDetailResponse.Code"));
		getLatestSubmitDetailResponse.setMessage(_ctx.stringValue("GetLatestSubmitDetailResponse.Message"));

		SubmitDetailResult submitDetailResult = new SubmitDetailResult();
		submitDetailResult.setId(_ctx.longValue("GetLatestSubmitDetailResponse.SubmitDetailResult.Id"));
		submitDetailResult.setSubmitStatus(_ctx.stringValue("GetLatestSubmitDetailResponse.SubmitDetailResult.SubmitStatus"));
		submitDetailResult.setPublishStatus(_ctx.stringValue("GetLatestSubmitDetailResponse.SubmitDetailResult.PublishStatus"));
		submitDetailResult.setTag(_ctx.stringValue("GetLatestSubmitDetailResponse.SubmitDetailResult.Tag"));

		ReleaseObject releaseObject = new ReleaseObject();
		releaseObject.setObjectVersion(_ctx.stringValue("GetLatestSubmitDetailResponse.SubmitDetailResult.ReleaseObject.ObjectVersion"));
		releaseObject.setChangeType(_ctx.stringValue("GetLatestSubmitDetailResponse.SubmitDetailResult.ReleaseObject.ChangeType"));
		releaseObject.setProjectId(_ctx.longValue("GetLatestSubmitDetailResponse.SubmitDetailResult.ReleaseObject.ProjectId"));
		releaseObject.setNodeId(_ctx.stringValue("GetLatestSubmitDetailResponse.SubmitDetailResult.ReleaseObject.NodeId"));
		releaseObject.setSubmitComment(_ctx.stringValue("GetLatestSubmitDetailResponse.SubmitDetailResult.ReleaseObject.SubmitComment"));

		SubmitObject submitObject = new SubmitObject();
		submitObject.setObjectId(_ctx.stringValue("GetLatestSubmitDetailResponse.SubmitDetailResult.ReleaseObject.SubmitObject.ObjectId"));
		submitObject.setObjectType(_ctx.stringValue("GetLatestSubmitDetailResponse.SubmitDetailResult.ReleaseObject.SubmitObject.ObjectType"));
		submitObject.setObjectName(_ctx.stringValue("GetLatestSubmitDetailResponse.SubmitDetailResult.ReleaseObject.SubmitObject.ObjectName"));
		releaseObject.setSubmitObject(submitObject);
		submitDetailResult.setReleaseObject(releaseObject);
		getLatestSubmitDetailResponse.setSubmitDetailResult(submitDetailResult);
	 
	 	return getLatestSubmitDetailResponse;
	}
}