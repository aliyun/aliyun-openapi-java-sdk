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

package com.aliyuncs.emas_dmp.transform.v20210402;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emas_dmp.model.v20210402.ListTagTreeResponse;
import com.aliyuncs.emas_dmp.model.v20210402.ListTagTreeResponse.Data;
import com.aliyuncs.emas_dmp.model.v20210402.ListTagTreeResponse.Data.Tag;
import com.aliyuncs.emas_dmp.model.v20210402.ListTagTreeResponse.Data.Tag.Sub1;
import com.aliyuncs.emas_dmp.model.v20210402.ListTagTreeResponse.Data.Tag.Sub1.Sub2;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTagTreeResponseUnmarshaller {

	public static ListTagTreeResponse unmarshall(ListTagTreeResponse listTagTreeResponse, UnmarshallerContext _ctx) {
		
		listTagTreeResponse.setRequestId(_ctx.stringValue("ListTagTreeResponse.RequestId"));

		Data data = new Data();

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("ListTagTreeResponse.Data.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setId(_ctx.integerValue("ListTagTreeResponse.Data.Tags["+ i +"].Id"));
			tag.setName(_ctx.stringValue("ListTagTreeResponse.Data.Tags["+ i +"].Name"));
			tag.setForeignCode(_ctx.stringValue("ListTagTreeResponse.Data.Tags["+ i +"].ForeignCode"));
			tag.setTypeId(_ctx.integerValue("ListTagTreeResponse.Data.Tags["+ i +"].TypeId"));
			tag.setLevel(_ctx.integerValue("ListTagTreeResponse.Data.Tags["+ i +"].Level"));
			tag.setParentId(_ctx.integerValue("ListTagTreeResponse.Data.Tags["+ i +"].ParentId"));
			tag.setEnabled(_ctx.booleanValue("ListTagTreeResponse.Data.Tags["+ i +"].Enabled"));

			List<Sub1> subList = new ArrayList<Sub1>();
			for (int j = 0; j < _ctx.lengthValue("ListTagTreeResponse.Data.Tags["+ i +"].SubList.Length"); j++) {
				Sub1 sub1 = new Sub1();
				sub1.setId(_ctx.integerValue("ListTagTreeResponse.Data.Tags["+ i +"].SubList["+ j +"].Id"));
				sub1.setName(_ctx.stringValue("ListTagTreeResponse.Data.Tags["+ i +"].SubList["+ j +"].Name"));
				sub1.setForeignCode(_ctx.stringValue("ListTagTreeResponse.Data.Tags["+ i +"].SubList["+ j +"].ForeignCode"));
				sub1.setTypeId(_ctx.integerValue("ListTagTreeResponse.Data.Tags["+ i +"].SubList["+ j +"].TypeId"));
				sub1.setLevel(_ctx.integerValue("ListTagTreeResponse.Data.Tags["+ i +"].SubList["+ j +"].Level"));
				sub1.setParentId(_ctx.integerValue("ListTagTreeResponse.Data.Tags["+ i +"].SubList["+ j +"].ParentId"));
				sub1.setEnabled(_ctx.booleanValue("ListTagTreeResponse.Data.Tags["+ i +"].SubList["+ j +"].Enabled"));

				List<Sub2> subs = new ArrayList<Sub2>();
				for (int k = 0; k < _ctx.lengthValue("ListTagTreeResponse.Data.Tags["+ i +"].SubList["+ j +"].Subs.Length"); k++) {
					Sub2 sub2 = new Sub2();
					sub2.setId(_ctx.integerValue("ListTagTreeResponse.Data.Tags["+ i +"].SubList["+ j +"].Subs["+ k +"].Id"));
					sub2.setName(_ctx.stringValue("ListTagTreeResponse.Data.Tags["+ i +"].SubList["+ j +"].Subs["+ k +"].Name"));
					sub2.setForeignCode(_ctx.stringValue("ListTagTreeResponse.Data.Tags["+ i +"].SubList["+ j +"].Subs["+ k +"].ForeignCode"));
					sub2.setTypeId(_ctx.integerValue("ListTagTreeResponse.Data.Tags["+ i +"].SubList["+ j +"].Subs["+ k +"].TypeId"));
					sub2.setLevel(_ctx.integerValue("ListTagTreeResponse.Data.Tags["+ i +"].SubList["+ j +"].Subs["+ k +"].Level"));
					sub2.setParentId(_ctx.integerValue("ListTagTreeResponse.Data.Tags["+ i +"].SubList["+ j +"].Subs["+ k +"].ParentId"));
					sub2.setSubs(_ctx.stringValue("ListTagTreeResponse.Data.Tags["+ i +"].SubList["+ j +"].Subs["+ k +"].Subs"));
					sub2.setEnabled(_ctx.booleanValue("ListTagTreeResponse.Data.Tags["+ i +"].SubList["+ j +"].Subs["+ k +"].Enabled"));

					subs.add(sub2);
				}
				sub1.setSubs(subs);

				subList.add(sub1);
			}
			tag.setSubList(subList);

			tags.add(tag);
		}
		data.setTags(tags);
		listTagTreeResponse.setData(data);
	 
	 	return listTagTreeResponse;
	}
}