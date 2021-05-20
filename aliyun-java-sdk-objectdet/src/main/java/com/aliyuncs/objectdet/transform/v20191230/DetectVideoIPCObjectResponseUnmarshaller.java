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

package com.aliyuncs.objectdet.transform.v20191230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.objectdet.model.v20191230.DetectVideoIPCObjectResponse;
import com.aliyuncs.objectdet.model.v20191230.DetectVideoIPCObjectResponse.Data;
import com.aliyuncs.objectdet.model.v20191230.DetectVideoIPCObjectResponse.Data.Frame;
import com.aliyuncs.objectdet.model.v20191230.DetectVideoIPCObjectResponse.Data.Frame.ElementsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectVideoIPCObjectResponseUnmarshaller {

	public static DetectVideoIPCObjectResponse unmarshall(DetectVideoIPCObjectResponse detectVideoIPCObjectResponse, UnmarshallerContext _ctx) {
		
		detectVideoIPCObjectResponse.setRequestId(_ctx.stringValue("DetectVideoIPCObjectResponse.RequestId"));
		detectVideoIPCObjectResponse.setMessage(_ctx.stringValue("DetectVideoIPCObjectResponse.Message"));
		detectVideoIPCObjectResponse.setCode(_ctx.stringValue("DetectVideoIPCObjectResponse.Code"));

		Data data = new Data();
		data.setHeight(_ctx.longValue("DetectVideoIPCObjectResponse.Data.Height"));
		data.setWidth(_ctx.longValue("DetectVideoIPCObjectResponse.Data.Width"));
		data.setInputFile(_ctx.stringValue("DetectVideoIPCObjectResponse.Data.InputFile"));

		List<Frame> frames = new ArrayList<Frame>();
		for (int i = 0; i < _ctx.lengthValue("DetectVideoIPCObjectResponse.Data.Frames.Length"); i++) {
			Frame frame = new Frame();
			frame.setTime(_ctx.longValue("DetectVideoIPCObjectResponse.Data.Frames["+ i +"].Time"));

			List<ElementsItem> elements = new ArrayList<ElementsItem>();
			for (int j = 0; j < _ctx.lengthValue("DetectVideoIPCObjectResponse.Data.Frames["+ i +"].Elements.Length"); j++) {
				ElementsItem elementsItem = new ElementsItem();
				elementsItem.setScore(_ctx.floatValue("DetectVideoIPCObjectResponse.Data.Frames["+ i +"].Elements["+ j +"].Score"));
				elementsItem.setType(_ctx.stringValue("DetectVideoIPCObjectResponse.Data.Frames["+ i +"].Elements["+ j +"].Type"));
				elementsItem.setX(_ctx.longValue("DetectVideoIPCObjectResponse.Data.Frames["+ i +"].Elements["+ j +"].X"));
				elementsItem.setY(_ctx.longValue("DetectVideoIPCObjectResponse.Data.Frames["+ i +"].Elements["+ j +"].Y"));
				elementsItem.setHeight(_ctx.longValue("DetectVideoIPCObjectResponse.Data.Frames["+ i +"].Elements["+ j +"].Height"));
				elementsItem.setWidth(_ctx.longValue("DetectVideoIPCObjectResponse.Data.Frames["+ i +"].Elements["+ j +"].Width"));

				elements.add(elementsItem);
			}
			frame.setElements(elements);

			frames.add(frame);
		}
		data.setFrames(frames);
		detectVideoIPCObjectResponse.setData(data);
	 
	 	return detectVideoIPCObjectResponse;
	}
}