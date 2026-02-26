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

package com.aliyuncs.trademark.transform.v20190902;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20190902.QueryDetailItemResponse;
import com.aliyuncs.trademark.model.v20190902.QueryDetailItemResponse.Module;
import com.aliyuncs.trademark.model.v20190902.QueryDetailItemResponse.Module.Attribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDetailItemResponseUnmarshaller {

	public static QueryDetailItemResponse unmarshall(QueryDetailItemResponse queryDetailItemResponse, UnmarshallerContext _ctx) {
		

		Module module = new Module();
		module.setDetailDescription(_ctx.stringValue("QueryDetailItemResponse.Module.DetailDescription"));
		module.setDetailObjectJson(_ctx.stringValue("QueryDetailItemResponse.Module.DetailObjectJson"));
		module.setDetailPagePicUrl(_ctx.stringValue("QueryDetailItemResponse.Module.DetailPagePicUrl"));
		module.setLabel(_ctx.stringValue("QueryDetailItemResponse.Module.Label"));
		module.setMainPicUrl(_ctx.stringValue("QueryDetailItemResponse.Module.MainPicUrl"));
		module.setTitle(_ctx.stringValue("QueryDetailItemResponse.Module.Title"));
		module.setType(_ctx.stringValue("QueryDetailItemResponse.Module.Type"));

		List<String> detailPicUrl = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryDetailItemResponse.Module.DetailPicUrl.Length"); i++) {
			detailPicUrl.add(_ctx.stringValue("QueryDetailItemResponse.Module.DetailPicUrl["+ i +"]"));
		}
		module.setDetailPicUrl(detailPicUrl);

		List<Attribute> attributes = new ArrayList<Attribute>();
		for (int i = 0; i < _ctx.lengthValue("QueryDetailItemResponse.Module.Attributes.Length"); i++) {
			Attribute attribute = new Attribute();
			attribute.setName(_ctx.stringValue("QueryDetailItemResponse.Module.Attributes["+ i +"].Name"));
			attribute.setTitle(_ctx.stringValue("QueryDetailItemResponse.Module.Attributes["+ i +"].Title"));
			attribute.setValue(_ctx.stringValue("QueryDetailItemResponse.Module.Attributes["+ i +"].Value"));

			attributes.add(attribute);
		}
		module.setAttributes(attributes);
		queryDetailItemResponse.setModule(module);
	 
	 	return queryDetailItemResponse;
	}
}