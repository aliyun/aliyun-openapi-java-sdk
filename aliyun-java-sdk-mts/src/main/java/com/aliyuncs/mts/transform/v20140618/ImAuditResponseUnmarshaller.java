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

package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.ImAuditResponse;
import com.aliyuncs.mts.model.v20140618.ImAuditResponse.ImageResult;
import com.aliyuncs.mts.model.v20140618.ImAuditResponse.TextResult;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ImAuditResponseUnmarshaller {

	public static ImAuditResponse unmarshall(ImAuditResponse imAuditResponse, UnmarshallerContext _ctx) {
		
		imAuditResponse.setRequestId(_ctx.stringValue("ImAuditResponse.RequestId"));
		imAuditResponse.setStatus(_ctx.stringValue("ImAuditResponse.Status"));
		imAuditResponse.setImageQuotaExceed(_ctx.booleanValue("ImAuditResponse.ImageQuotaExceed"));
		imAuditResponse.setTextQuotaExceed(_ctx.booleanValue("ImAuditResponse.TextQuotaExceed"));

		List<TextResult> textResults = new ArrayList<TextResult>();
		for (int i = 0; i < _ctx.lengthValue("ImAuditResponse.TextResults.Length"); i++) {
			TextResult textResult = new TextResult();
			textResult.setResult(_ctx.mapValue("ImAuditResponse.TextResults["+ i +"].Result"));

			textResults.add(textResult);
		}
		imAuditResponse.setTextResults(textResults);

		List<ImageResult> imageResults = new ArrayList<ImageResult>();
		for (int i = 0; i < _ctx.lengthValue("ImAuditResponse.ImageResults.Length"); i++) {
			ImageResult imageResult = new ImageResult();
			imageResult.setResult(_ctx.mapValue("ImAuditResponse.ImageResults["+ i +"].Result"));

			imageResults.add(imageResult);
		}
		imAuditResponse.setImageResults(imageResults);
	 
	 	return imAuditResponse;
	}
}