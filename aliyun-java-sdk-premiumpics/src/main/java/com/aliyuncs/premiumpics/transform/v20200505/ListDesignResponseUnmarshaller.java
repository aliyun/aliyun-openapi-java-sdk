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

package com.aliyuncs.premiumpics.transform.v20200505;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.premiumpics.model.v20200505.ListDesignResponse;
import com.aliyuncs.premiumpics.model.v20200505.ListDesignResponse.Designs;
import com.aliyuncs.premiumpics.model.v20200505.ListDesignResponse.Designs.TemplatesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDesignResponseUnmarshaller {

	public static ListDesignResponse unmarshall(ListDesignResponse listDesignResponse, UnmarshallerContext _ctx) {
		
		listDesignResponse.setRequestId(_ctx.stringValue("ListDesignResponse.RequestId"));
		listDesignResponse.setSuccess(_ctx.booleanValue("ListDesignResponse.Success"));
		listDesignResponse.setVersion(_ctx.stringValue("ListDesignResponse.Version"));
		listDesignResponse.setEnd(_ctx.integerValue("ListDesignResponse.End"));
		listDesignResponse.setPageNumber(_ctx.integerValue("ListDesignResponse.PageNumber"));
		listDesignResponse.setDesignVersion(_ctx.stringValue("ListDesignResponse.DesignVersion"));

		List<Designs> data = new ArrayList<Designs>();
		for (int i = 0; i < _ctx.lengthValue("ListDesignResponse.Data.Length"); i++) {
			Designs designs = new Designs();
			designs.setGoodsId(_ctx.stringValue("ListDesignResponse.Data["+ i +"].GoodsId"));

			List<TemplatesItem> templates = new ArrayList<TemplatesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListDesignResponse.Data["+ i +"].Templates.Length"); j++) {
				TemplatesItem templatesItem = new TemplatesItem();
				templatesItem.setTemplateId(_ctx.stringValue("ListDesignResponse.Data["+ i +"].Templates["+ j +"].TemplateId"));
				templatesItem.setPreviewUrl(_ctx.stringValue("ListDesignResponse.Data["+ i +"].Templates["+ j +"].PreviewUrl"));

				templates.add(templatesItem);
			}
			designs.setTemplates(templates);

			data.add(designs);
		}
		listDesignResponse.setData(data);
	 
	 	return listDesignResponse;
	}
}