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

package com.aliyuncs.cr.transform.v20160607;

import com.aliyuncs.cr.model.v20160607.GetRepoTagResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRepoTagResponseUnmarshaller {

	public static GetRepoTagResponse unmarshall(GetRepoTagResponse getRepoTagResponse, UnmarshallerContext _ctx) {
		
		getRepoTagResponse.setRequestId(_ctx.stringValue("GetRepoTagResponse.requestId"));
		getRepoTagResponse.setStatus(_ctx.stringValue("GetRepoTagResponse.status"));
		getRepoTagResponse.setTag(_ctx.stringValue("GetRepoTagResponse.tag"));
		getRepoTagResponse.setDigest(_ctx.stringValue("GetRepoTagResponse.digest"));
		getRepoTagResponse.setImageId(_ctx.stringValue("GetRepoTagResponse.imageId"));
		getRepoTagResponse.setImageCreate(_ctx.longValue("GetRepoTagResponse.imageCreate"));
		getRepoTagResponse.setImageUpdate(_ctx.longValue("GetRepoTagResponse.imageUpdate"));
		getRepoTagResponse.setImageSize(_ctx.longValue("GetRepoTagResponse.imageSize"));
	 
	 	return getRepoTagResponse;
	}
}