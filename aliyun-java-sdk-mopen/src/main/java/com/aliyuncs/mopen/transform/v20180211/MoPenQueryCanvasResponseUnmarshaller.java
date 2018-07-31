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

package com.aliyuncs.mopen.transform.v20180211;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mopen.model.v20180211.MoPenQueryCanvasResponse;
import com.aliyuncs.mopen.model.v20180211.MoPenQueryCanvasResponse.Data;
import com.aliyuncs.mopen.model.v20180211.MoPenQueryCanvasResponse.Data.Canvas;
import com.aliyuncs.transform.UnmarshallerContext;


public class MoPenQueryCanvasResponseUnmarshaller {

	public static MoPenQueryCanvasResponse unmarshall(MoPenQueryCanvasResponse moPenQueryCanvasResponse, UnmarshallerContext context) {
		
		moPenQueryCanvasResponse.setRequestId(context.stringValue("MoPenQueryCanvasResponse.RequestId"));
		moPenQueryCanvasResponse.setCode(context.stringValue("MoPenQueryCanvasResponse.Code"));
		moPenQueryCanvasResponse.setMessage(context.stringValue("MoPenQueryCanvasResponse.Message"));
		moPenQueryCanvasResponse.setSuccess(context.booleanValue("MoPenQueryCanvasResponse.Success"));
		moPenQueryCanvasResponse.setDescription(context.stringValue("MoPenQueryCanvasResponse.Description"));

		Data data = new Data();

		List<Canvas> canvasList = new ArrayList<Canvas>();
		for (int i = 0; i < context.lengthValue("MoPenQueryCanvasResponse.Data.CanvasList.Length"); i++) {
			Canvas canvas = new Canvas();
			canvas.setId(context.longValue("MoPenQueryCanvasResponse.Data.CanvasList["+ i +"].Id"));
			canvas.setDeviceName(context.stringValue("MoPenQueryCanvasResponse.Data.CanvasList["+ i +"].DeviceName"));
			canvas.setUrl(context.stringValue("MoPenQueryCanvasResponse.Data.CanvasList["+ i +"].Url"));
			canvas.setPageId(context.integerValue("MoPenQueryCanvasResponse.Data.CanvasList["+ i +"].PageId"));
			canvas.setSessionId(context.stringValue("MoPenQueryCanvasResponse.Data.CanvasList["+ i +"].SessionId"));
			canvas.setCreateTime(context.stringValue("MoPenQueryCanvasResponse.Data.CanvasList["+ i +"].CreateTime"));
			canvas.setLastModified(context.stringValue("MoPenQueryCanvasResponse.Data.CanvasList["+ i +"].LastModified"));
			canvas.setStatus(context.integerValue("MoPenQueryCanvasResponse.Data.CanvasList["+ i +"].Status"));
			canvas.setAttribute(context.stringValue("MoPenQueryCanvasResponse.Data.CanvasList["+ i +"].Attribute"));

			canvasList.add(canvas);
		}
		data.setCanvasList(canvasList);
		moPenQueryCanvasResponse.setData(data);
	 
	 	return moPenQueryCanvasResponse;
	}
}