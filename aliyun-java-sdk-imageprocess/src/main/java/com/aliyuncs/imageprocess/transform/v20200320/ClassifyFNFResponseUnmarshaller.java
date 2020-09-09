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

package com.aliyuncs.imageprocess.transform.v20200320;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imageprocess.model.v20200320.ClassifyFNFResponse;
import com.aliyuncs.imageprocess.model.v20200320.ClassifyFNFResponse.Data;
import com.aliyuncs.imageprocess.model.v20200320.ClassifyFNFResponse.Data.FracturesItem;
import com.aliyuncs.imageprocess.model.v20200320.ClassifyFNFResponse.Data.FracturesItem.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ClassifyFNFResponseUnmarshaller {

	public static ClassifyFNFResponse unmarshall(ClassifyFNFResponse classifyFNFResponse, UnmarshallerContext _ctx) {
		
		classifyFNFResponse.setRequestId(_ctx.stringValue("ClassifyFNFResponse.RequestId"));

		Data data = new Data();
		data.setImageUrl(_ctx.stringValue("ClassifyFNFResponse.Data.ImageUrl"));
		data.setOrgId(_ctx.stringValue("ClassifyFNFResponse.Data.OrgId"));
		data.setOrgName(_ctx.stringValue("ClassifyFNFResponse.Data.OrgName"));

		List<FracturesItem> fractures = new ArrayList<FracturesItem>();
		for (int i = 0; i < _ctx.lengthValue("ClassifyFNFResponse.Data.Fractures.Length"); i++) {
			FracturesItem fracturesItem = new FracturesItem();
			fracturesItem.setValue(_ctx.floatValue("ClassifyFNFResponse.Data.Fractures["+ i +"].Value"));

			List<Integer> boxes = new ArrayList<Integer>();
			for (int j = 0; j < _ctx.lengthValue("ClassifyFNFResponse.Data.Fractures["+ i +"].Boxes.Length"); j++) {
				boxes.add(_ctx.integerValue("ClassifyFNFResponse.Data.Fractures["+ i +"].Boxes["+ j +"]"));
			}
			fracturesItem.setBoxes(boxes);

			Tag tag = new Tag();
			tag.setLabel(_ctx.stringValue("ClassifyFNFResponse.Data.Fractures["+ i +"].Tag.Label"));
			fracturesItem.setTag(tag);

			fractures.add(fracturesItem);
		}
		data.setFractures(fractures);
		classifyFNFResponse.setData(data);
	 
	 	return classifyFNFResponse;
	}
}