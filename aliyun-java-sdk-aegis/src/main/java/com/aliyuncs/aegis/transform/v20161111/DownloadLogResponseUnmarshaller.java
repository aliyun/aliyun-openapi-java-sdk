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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DownloadLogResponse;
import com.aliyuncs.aegis.model.v20161111.DownloadLogResponse.StackTraceItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DownloadLogResponseUnmarshaller {

	public static DownloadLogResponse unmarshall(DownloadLogResponse downloadLogResponse, UnmarshallerContext context) {
		
		downloadLogResponse.setRequestId(context.stringValue("DownloadLogResponse.RequestId"));

		List<String> suppressed = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DownloadLogResponse.Suppressed.Length"); i++) {
			suppressed.add(context.stringValue("DownloadLogResponse.Suppressed["+ i +"]"));
		}
		downloadLogResponse.setSuppressed(suppressed);

		List<StackTraceItem> stackTrace = new ArrayList<StackTraceItem>();
		for (int i = 0; i < context.lengthValue("DownloadLogResponse.StackTrace.Length"); i++) {
			StackTraceItem stackTraceItem = new StackTraceItem();
			stackTraceItem.setFileName(context.stringValue("DownloadLogResponse.StackTrace["+ i +"].FileName"));
			stackTraceItem.setNativeMethod(context.booleanValue("DownloadLogResponse.StackTrace["+ i +"].NativeMethod"));
			stackTraceItem.setMethodName(context.stringValue("DownloadLogResponse.StackTrace["+ i +"].MethodName"));
			stackTraceItem.setClassName(context.stringValue("DownloadLogResponse.StackTrace["+ i +"].ClassName"));
			stackTraceItem.setLineNumber(context.integerValue("DownloadLogResponse.StackTrace["+ i +"].LineNumber"));

			stackTrace.add(stackTraceItem);
		}
		downloadLogResponse.setStackTrace(stackTrace);
	 
	 	return downloadLogResponse;
	}
}