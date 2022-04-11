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

package com.aliyuncs.vod.transform.v20170321;

import com.aliyuncs.vod.model.v20170321.RefreshMediaPlayUrlsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RefreshMediaPlayUrlsResponseUnmarshaller {

	public static RefreshMediaPlayUrlsResponse unmarshall(RefreshMediaPlayUrlsResponse refreshMediaPlayUrlsResponse, UnmarshallerContext _ctx) {
		
		refreshMediaPlayUrlsResponse.setRequestId(_ctx.stringValue("RefreshMediaPlayUrlsResponse.RequestId"));
		refreshMediaPlayUrlsResponse.setMediaRefreshJobId(_ctx.stringValue("RefreshMediaPlayUrlsResponse.MediaRefreshJobId"));
		refreshMediaPlayUrlsResponse.setNonExistMediaIds(_ctx.stringValue("RefreshMediaPlayUrlsResponse.NonExistMediaIds"));
		refreshMediaPlayUrlsResponse.setForbiddenMediaIds(_ctx.stringValue("RefreshMediaPlayUrlsResponse.ForbiddenMediaIds"));
	 
	 	return refreshMediaPlayUrlsResponse;
	}
}