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

import com.aliyuncs.arms.model.v20190808.CreateRetcodeAppResponse;
import com.aliyuncs.arms.model.v20190808.CreateRetcodeAppResponse.RetcodeAppDataBean;
import com.aliyuncs.arms.model.v20190808.CreateRetcodeAppResponse.RetcodeAppDataBean.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateRetcodeAppResponseUnmarshaller {

	public static CreateRetcodeAppResponse unmarshall(CreateRetcodeAppResponse createRetcodeAppResponse, UnmarshallerContext _ctx) {
		
		createRetcodeAppResponse.setRequestId(_ctx.stringValue("CreateRetcodeAppResponse.RequestId"));

		RetcodeAppDataBean retcodeAppDataBean = new RetcodeAppDataBean();
		retcodeAppDataBean.setPid(_ctx.stringValue("CreateRetcodeAppResponse.RetcodeAppDataBean.Pid"));
		retcodeAppDataBean.setAppId(_ctx.longValue("CreateRetcodeAppResponse.RetcodeAppDataBean.AppId"));
		retcodeAppDataBean.setResourceGroupId(_ctx.stringValue("CreateRetcodeAppResponse.RetcodeAppDataBean.ResourceGroupId"));

		List<TagsItem> tags = new ArrayList<TagsItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateRetcodeAppResponse.RetcodeAppDataBean.Tags.Length"); i++) {
			TagsItem tagsItem = new TagsItem();
			tagsItem.setKey(_ctx.stringValue("CreateRetcodeAppResponse.RetcodeAppDataBean.Tags["+ i +"].Key"));
			tagsItem.setValue(_ctx.stringValue("CreateRetcodeAppResponse.RetcodeAppDataBean.Tags["+ i +"].Value"));

			tags.add(tagsItem);
		}
		retcodeAppDataBean.setTags(tags);
		createRetcodeAppResponse.setRetcodeAppDataBean(retcodeAppDataBean);
	 
	 	return createRetcodeAppResponse;
	}
}