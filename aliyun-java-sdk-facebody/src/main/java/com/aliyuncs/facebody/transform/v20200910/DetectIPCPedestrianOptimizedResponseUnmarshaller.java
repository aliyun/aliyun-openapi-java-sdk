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

package com.aliyuncs.facebody.transform.v20200910;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.facebody.model.v20200910.DetectIPCPedestrianOptimizedResponse;
import com.aliyuncs.facebody.model.v20200910.DetectIPCPedestrianOptimizedResponse.Data;
import com.aliyuncs.facebody.model.v20200910.DetectIPCPedestrianOptimizedResponse.Data.ImageInfoListItem;
import com.aliyuncs.facebody.model.v20200910.DetectIPCPedestrianOptimizedResponse.Data.ImageInfoListItem.Element;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectIPCPedestrianOptimizedResponseUnmarshaller {

	public static DetectIPCPedestrianOptimizedResponse unmarshall(DetectIPCPedestrianOptimizedResponse detectIPCPedestrianOptimizedResponse, UnmarshallerContext _ctx) {
		
		detectIPCPedestrianOptimizedResponse.setRequestId(_ctx.stringValue("DetectIPCPedestrianOptimizedResponse.RequestId"));

		Data data = new Data();

		List<ImageInfoListItem> imageInfoList = new ArrayList<ImageInfoListItem>();
		for (int i = 0; i < _ctx.lengthValue("DetectIPCPedestrianOptimizedResponse.Data.ImageInfoList.Length"); i++) {
			ImageInfoListItem imageInfoListItem = new ImageInfoListItem();

			List<Element> elements = new ArrayList<Element>();
			for (int j = 0; j < _ctx.lengthValue("DetectIPCPedestrianOptimizedResponse.Data.ImageInfoList["+ i +"].Elements.Length"); j++) {
				Element element = new Element();
				element.setScore(_ctx.floatValue("DetectIPCPedestrianOptimizedResponse.Data.ImageInfoList["+ i +"].Elements["+ j +"].Score"));

				List<Long> boxes = new ArrayList<Long>();
				for (int k = 0; k < _ctx.lengthValue("DetectIPCPedestrianOptimizedResponse.Data.ImageInfoList["+ i +"].Elements["+ j +"].Boxes.Length"); k++) {
					boxes.add(_ctx.longValue("DetectIPCPedestrianOptimizedResponse.Data.ImageInfoList["+ i +"].Elements["+ j +"].Boxes["+ k +"]"));
				}
				element.setBoxes(boxes);

				elements.add(element);
			}
			imageInfoListItem.setElements(elements);

			imageInfoList.add(imageInfoListItem);
		}
		data.setImageInfoList(imageInfoList);
		detectIPCPedestrianOptimizedResponse.setData(data);
	 
	 	return detectIPCPedestrianOptimizedResponse;
	}
}