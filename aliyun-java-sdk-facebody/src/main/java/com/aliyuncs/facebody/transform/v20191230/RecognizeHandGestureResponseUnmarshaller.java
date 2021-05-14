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

import com.aliyuncs.facebody.model.v20191230.RecognizeHandGestureResponse;
import com.aliyuncs.facebody.model.v20191230.RecognizeHandGestureResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeHandGestureResponseUnmarshaller {

	public static RecognizeHandGestureResponse unmarshall(RecognizeHandGestureResponse recognizeHandGestureResponse, UnmarshallerContext _ctx) {
		
		recognizeHandGestureResponse.setRequestId(_ctx.stringValue("RecognizeHandGestureResponse.RequestId"));
		recognizeHandGestureResponse.setCode(_ctx.stringValue("RecognizeHandGestureResponse.Code"));
		recognizeHandGestureResponse.setMessage(_ctx.stringValue("RecognizeHandGestureResponse.Message"));

		Data data = new Data();
		data.setType(_ctx.stringValue("RecognizeHandGestureResponse.Data.Type"));
		data.setX(_ctx.longValue("RecognizeHandGestureResponse.Data.X"));
		data.setY(_ctx.longValue("RecognizeHandGestureResponse.Data.Y"));
		data.setWidth(_ctx.longValue("RecognizeHandGestureResponse.Data.Width"));
		data.setHeight(_ctx.longValue("RecognizeHandGestureResponse.Data.Height"));
		data.setScore(_ctx.floatValue("RecognizeHandGestureResponse.Data.Score"));
		recognizeHandGestureResponse.setData(data);
	 
	 	return recognizeHandGestureResponse;
	}
}