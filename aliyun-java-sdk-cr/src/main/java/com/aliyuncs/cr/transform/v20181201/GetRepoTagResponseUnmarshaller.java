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

import com.aliyuncs.cr.model.v20181201.GetRepoTagResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRepoTagResponseUnmarshaller {

	public static GetRepoTagResponse unmarshall(GetRepoTagResponse getRepoTagResponse, UnmarshallerContext _ctx) {
		
		getRepoTagResponse.setRequestId(_ctx.stringValue("GetRepoTagResponse.RequestId"));
		getRepoTagResponse.setStatus(_ctx.stringValue("GetRepoTagResponse.Status"));
		getRepoTagResponse.setImageCreate(_ctx.longValue("GetRepoTagResponse.ImageCreate"));
		getRepoTagResponse.setImageSize(_ctx.longValue("GetRepoTagResponse.ImageSize"));
		getRepoTagResponse.setDigest(_ctx.stringValue("GetRepoTagResponse.Digest"));
		getRepoTagResponse.setCode(_ctx.stringValue("GetRepoTagResponse.Code"));
		getRepoTagResponse.setImageUpdate(_ctx.longValue("GetRepoTagResponse.ImageUpdate"));
		getRepoTagResponse.setTag(_ctx.stringValue("GetRepoTagResponse.Tag"));
		getRepoTagResponse.setIsSuccess(_ctx.booleanValue("GetRepoTagResponse.IsSuccess"));
		getRepoTagResponse.setImageId(_ctx.stringValue("GetRepoTagResponse.ImageId"));
	 
	 	return getRepoTagResponse;
	}
}