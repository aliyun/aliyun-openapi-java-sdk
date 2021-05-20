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

package com.aliyuncs.ververica.transform.v20200501;

import com.aliyuncs.ververica.model.v20200501.ListArtifactsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListArtifactsResponseUnmarshaller {

	public static ListArtifactsResponse unmarshall(ListArtifactsResponse listArtifactsResponse, UnmarshallerContext _ctx) {
		
		listArtifactsResponse.setRequestId(_ctx.stringValue("ListArtifactsResponse.requestId"));
		listArtifactsResponse.setData(_ctx.stringValue("ListArtifactsResponse.data"));
		listArtifactsResponse.setSuccess(_ctx.booleanValue("ListArtifactsResponse.success"));
	 
	 	return listArtifactsResponse;
	}
}