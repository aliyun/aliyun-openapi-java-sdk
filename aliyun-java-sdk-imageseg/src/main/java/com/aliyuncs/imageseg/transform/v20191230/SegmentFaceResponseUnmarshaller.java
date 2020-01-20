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

package com.aliyuncs.imageseg.transform.v20191230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imageseg.model.v20191230.SegmentFaceResponse;
import com.aliyuncs.imageseg.model.v20191230.SegmentFaceResponse.Data;
import com.aliyuncs.imageseg.model.v20191230.SegmentFaceResponse.Data.Element;
import com.aliyuncs.transform.UnmarshallerContext;


public class SegmentFaceResponseUnmarshaller {

	public static SegmentFaceResponse unmarshall(SegmentFaceResponse segmentFaceResponse, UnmarshallerContext _ctx) {
		
		segmentFaceResponse.setRequestId(_ctx.stringValue("SegmentFaceResponse.RequestId"));

		Data data = new Data();

		List<Element> elements = new ArrayList<Element>();
		for (int i = 0; i < _ctx.lengthValue("SegmentFaceResponse.Data.Elements.Length"); i++) {
			Element element = new Element();
			element.setImageURL(_ctx.stringValue("SegmentFaceResponse.Data.Elements["+ i +"].ImageURL"));
			element.setX(_ctx.integerValue("SegmentFaceResponse.Data.Elements["+ i +"].X"));
			element.setY(_ctx.integerValue("SegmentFaceResponse.Data.Elements["+ i +"].Y"));
			element.setWidth(_ctx.integerValue("SegmentFaceResponse.Data.Elements["+ i +"].Width"));
			element.setHeight(_ctx.integerValue("SegmentFaceResponse.Data.Elements["+ i +"].Height"));

			elements.add(element);
		}
		data.setElements(elements);
		segmentFaceResponse.setData(data);
	 
	 	return segmentFaceResponse;
	}
}