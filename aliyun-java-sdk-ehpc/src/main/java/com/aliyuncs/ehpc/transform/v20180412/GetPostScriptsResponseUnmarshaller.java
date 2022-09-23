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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.GetPostScriptsResponse;
import com.aliyuncs.ehpc.model.v20180412.GetPostScriptsResponse.PostInstallScriptsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPostScriptsResponseUnmarshaller {

	public static GetPostScriptsResponse unmarshall(GetPostScriptsResponse getPostScriptsResponse, UnmarshallerContext _ctx) {
		
		getPostScriptsResponse.setRequestId(_ctx.stringValue("GetPostScriptsResponse.RequestId"));

		List<PostInstallScriptsItem> postInstallScripts = new ArrayList<PostInstallScriptsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetPostScriptsResponse.PostInstallScripts.Length"); i++) {
			PostInstallScriptsItem postInstallScriptsItem = new PostInstallScriptsItem();
			postInstallScriptsItem.setArgs(_ctx.stringValue("GetPostScriptsResponse.PostInstallScripts["+ i +"].Args"));
			postInstallScriptsItem.setUrl(_ctx.stringValue("GetPostScriptsResponse.PostInstallScripts["+ i +"].Url"));

			postInstallScripts.add(postInstallScriptsItem);
		}
		getPostScriptsResponse.setPostInstallScripts(postInstallScripts);
	 
	 	return getPostScriptsResponse;
	}
}