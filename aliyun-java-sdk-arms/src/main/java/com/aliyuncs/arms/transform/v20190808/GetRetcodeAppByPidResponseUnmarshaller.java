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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.GetRetcodeAppByPidResponse;
import com.aliyuncs.arms.model.v20190808.GetRetcodeAppByPidResponse.RetcodeApp;
import com.aliyuncs.arms.model.v20190808.GetRetcodeAppByPidResponse.RetcodeApp.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRetcodeAppByPidResponseUnmarshaller {

	public static GetRetcodeAppByPidResponse unmarshall(GetRetcodeAppByPidResponse getRetcodeAppByPidResponse, UnmarshallerContext _ctx) {
		
		getRetcodeAppByPidResponse.setRequestId(_ctx.stringValue("GetRetcodeAppByPidResponse.RequestId"));

		RetcodeApp retcodeApp = new RetcodeApp();
		retcodeApp.setAppName(_ctx.stringValue("GetRetcodeAppByPidResponse.RetcodeApp.AppName"));
		retcodeApp.setRetcodeAppType(_ctx.stringValue("GetRetcodeAppByPidResponse.RetcodeApp.RetcodeAppType"));
		retcodeApp.setAppId(_ctx.stringValue("GetRetcodeAppByPidResponse.RetcodeApp.AppId"));
		retcodeApp.setPid(_ctx.stringValue("GetRetcodeAppByPidResponse.RetcodeApp.Pid"));
		retcodeApp.setResourceGroupId(_ctx.stringValue("GetRetcodeAppByPidResponse.RetcodeApp.ResourceGroupId"));

		List<TagsItem> tags = new ArrayList<TagsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetRetcodeAppByPidResponse.RetcodeApp.Tags.Length"); i++) {
			TagsItem tagsItem = new TagsItem();
			tagsItem.setKey(_ctx.stringValue("GetRetcodeAppByPidResponse.RetcodeApp.Tags["+ i +"].Key"));
			tagsItem.setValue(_ctx.stringValue("GetRetcodeAppByPidResponse.RetcodeApp.Tags["+ i +"].Value"));

			tags.add(tagsItem);
		}
		retcodeApp.setTags(tags);
		getRetcodeAppByPidResponse.setRetcodeApp(retcodeApp);
	 
	 	return getRetcodeAppByPidResponse;
	}
}