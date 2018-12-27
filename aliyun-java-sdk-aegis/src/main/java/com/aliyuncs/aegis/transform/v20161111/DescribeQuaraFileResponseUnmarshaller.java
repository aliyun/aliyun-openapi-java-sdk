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

import com.aliyuncs.aegis.model.v20161111.DescribeQuaraFileResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeQuaraFileResponse.QuaraFile;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeQuaraFileResponseUnmarshaller {

	public static DescribeQuaraFileResponse unmarshall(DescribeQuaraFileResponse describeQuaraFileResponse, UnmarshallerContext context) {
		
		describeQuaraFileResponse.setRequestId(context.stringValue("DescribeQuaraFileResponse.RequestId"));
		describeQuaraFileResponse.setPageSize(context.integerValue("DescribeQuaraFileResponse.PageSize"));
		describeQuaraFileResponse.setTotalCount(context.integerValue("DescribeQuaraFileResponse.TotalCount"));
		describeQuaraFileResponse.setCurrentPage(context.integerValue("DescribeQuaraFileResponse.CurrentPage"));

		List<QuaraFile> quaraFiles = new ArrayList<QuaraFile>();
		for (int i = 0; i < context.lengthValue("DescribeQuaraFileResponse.QuaraFiles.Length"); i++) {
			QuaraFile quaraFile = new QuaraFile();
			quaraFile.setPath(context.stringValue("DescribeQuaraFileResponse.QuaraFiles["+ i +"].Path"));
			quaraFile.setEventName(context.stringValue("DescribeQuaraFileResponse.QuaraFiles["+ i +"].EventName"));
			quaraFile.setOnline(context.booleanValue("DescribeQuaraFileResponse.QuaraFiles["+ i +"].Online"));
			quaraFile.setEventType(context.stringValue("DescribeQuaraFileResponse.QuaraFiles["+ i +"].EventType"));
			quaraFile.setTag(context.stringValue("DescribeQuaraFileResponse.QuaraFiles["+ i +"].Tag"));
			quaraFile.setUuid(context.stringValue("DescribeQuaraFileResponse.QuaraFiles["+ i +"].Uuid"));
			quaraFile.setFileStatus(context.stringValue("DescribeQuaraFileResponse.QuaraFiles["+ i +"].FileStatus"));
			quaraFile.setMd5(context.stringValue("DescribeQuaraFileResponse.QuaraFiles["+ i +"].Md5"));

			quaraFiles.add(quaraFile);
		}
		describeQuaraFileResponse.setQuaraFiles(quaraFiles);
	 
	 	return describeQuaraFileResponse;
	}
}