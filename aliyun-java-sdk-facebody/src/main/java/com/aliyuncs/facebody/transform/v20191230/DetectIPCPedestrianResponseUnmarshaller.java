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

package com.aliyuncs.facebody.transform.v20191230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.facebody.model.v20191230.DetectIPCPedestrianResponse;
import com.aliyuncs.facebody.model.v20191230.DetectIPCPedestrianResponse.Data;
import com.aliyuncs.facebody.model.v20191230.DetectIPCPedestrianResponse.Data.ImageInfoListItem;
import com.aliyuncs.facebody.model.v20191230.DetectIPCPedestrianResponse.Data.ImageInfoListItem.Element;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectIPCPedestrianResponseUnmarshaller {

	public static DetectIPCPedestrianResponse unmarshall(DetectIPCPedestrianResponse detectIPCPedestrianResponse, UnmarshallerContext _ctx) {
		
		detectIPCPedestrianResponse.setRequestId(_ctx.stringValue("DetectIPCPedestrianResponse.RequestId"));

		Data data = new Data();

		List<ImageInfoListItem> imageInfoList = new ArrayList<ImageInfoListItem>();
		for (int i = 0; i < _ctx.lengthValue("DetectIPCPedestrianResponse.Data.ImageInfoList.Length"); i++) {
			ImageInfoListItem imageInfoListItem = new ImageInfoListItem();
			imageInfoListItem.setDataId(_ctx.stringValue("DetectIPCPedestrianResponse.Data.ImageInfoList["+ i +"].DataId"));
			imageInfoListItem.setErrorCode(_ctx.stringValue("DetectIPCPedestrianResponse.Data.ImageInfoList["+ i +"].ErrorCode"));
			imageInfoListItem.setErrorMessage(_ctx.stringValue("DetectIPCPedestrianResponse.Data.ImageInfoList["+ i +"].ErrorMessage"));

			List<Element> elements = new ArrayList<Element>();
			for (int j = 0; j < _ctx.lengthValue("DetectIPCPedestrianResponse.Data.ImageInfoList["+ i +"].Elements.Length"); j++) {
				Element element = new Element();
				element.setScore(_ctx.floatValue("DetectIPCPedestrianResponse.Data.ImageInfoList["+ i +"].Elements["+ j +"].Score"));

				List<Integer> boxes = new ArrayList<Integer>();
				for (int k = 0; k < _ctx.lengthValue("DetectIPCPedestrianResponse.Data.ImageInfoList["+ i +"].Elements["+ j +"].Boxes.Length"); k++) {
					boxes.add(_ctx.integerValue("DetectIPCPedestrianResponse.Data.ImageInfoList["+ i +"].Elements["+ j +"].Boxes["+ k +"]"));
				}
				element.setBoxes(boxes);

				elements.add(element);
			}
			imageInfoListItem.setElements(elements);

			imageInfoList.add(imageInfoListItem);
		}
		data.setImageInfoList(imageInfoList);
		detectIPCPedestrianResponse.setData(data);
	 
	 	return detectIPCPedestrianResponse;
	}
}