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

import com.aliyuncs.aegis.model.v20161111.DescribeSuspEventQuaraFilesResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeSuspEventQuaraFilesResponse.QuaraFile;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSuspEventQuaraFilesResponseUnmarshaller {

	public static DescribeSuspEventQuaraFilesResponse unmarshall(DescribeSuspEventQuaraFilesResponse describeSuspEventQuaraFilesResponse, UnmarshallerContext context) {
		
		describeSuspEventQuaraFilesResponse.setRequestId(context.stringValue("DescribeSuspEventQuaraFilesResponse.RequestId"));
		describeSuspEventQuaraFilesResponse.setCount(context.integerValue("DescribeSuspEventQuaraFilesResponse.Count"));
		describeSuspEventQuaraFilesResponse.setPageSize(context.integerValue("DescribeSuspEventQuaraFilesResponse.PageSize"));
		describeSuspEventQuaraFilesResponse.setTotalCount(context.integerValue("DescribeSuspEventQuaraFilesResponse.TotalCount"));
		describeSuspEventQuaraFilesResponse.setCurrentPage(context.integerValue("DescribeSuspEventQuaraFilesResponse.CurrentPage"));

		List<QuaraFile> quaraFiles = new ArrayList<QuaraFile>();
		for (int i = 0; i < context.lengthValue("DescribeSuspEventQuaraFilesResponse.QuaraFiles.Length"); i++) {
			QuaraFile quaraFile = new QuaraFile();
			quaraFile.setPath(context.stringValue("DescribeSuspEventQuaraFilesResponse.QuaraFiles["+ i +"].Path"));
			quaraFile.setEventName(context.stringValue("DescribeSuspEventQuaraFilesResponse.QuaraFiles["+ i +"].EventName"));
			quaraFile.setId(context.integerValue("DescribeSuspEventQuaraFilesResponse.QuaraFiles["+ i +"].Id"));
			quaraFile.setEventType(context.stringValue("DescribeSuspEventQuaraFilesResponse.QuaraFiles["+ i +"].EventType"));
			quaraFile.setTag(context.stringValue("DescribeSuspEventQuaraFilesResponse.QuaraFiles["+ i +"].Tag"));
			quaraFile.setUuid(context.stringValue("DescribeSuspEventQuaraFilesResponse.QuaraFiles["+ i +"].Uuid"));
			quaraFile.setInstanceName(context.stringValue("DescribeSuspEventQuaraFilesResponse.QuaraFiles["+ i +"].InstanceName"));
			quaraFile.setInternetIp(context.stringValue("DescribeSuspEventQuaraFilesResponse.QuaraFiles["+ i +"].InternetIp"));
			quaraFile.setIp(context.stringValue("DescribeSuspEventQuaraFilesResponse.QuaraFiles["+ i +"].Ip"));
			quaraFile.setStatus(context.stringValue("DescribeSuspEventQuaraFilesResponse.QuaraFiles["+ i +"].Status"));
			quaraFile.setMd5(context.stringValue("DescribeSuspEventQuaraFilesResponse.QuaraFiles["+ i +"].Md5"));
			quaraFile.setModifyTime(context.stringValue("DescribeSuspEventQuaraFilesResponse.QuaraFiles["+ i +"].ModifyTime"));

			quaraFiles.add(quaraFile);
		}
		describeSuspEventQuaraFilesResponse.setQuaraFiles(quaraFiles);
	 
	 	return describeSuspEventQuaraFilesResponse;
	}
}