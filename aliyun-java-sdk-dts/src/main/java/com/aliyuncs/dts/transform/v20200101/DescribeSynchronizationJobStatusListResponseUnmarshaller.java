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

package com.aliyuncs.dts.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dts.model.v20200101.DescribeSynchronizationJobStatusListResponse;
import com.aliyuncs.dts.model.v20200101.DescribeSynchronizationJobStatusListResponse.SynchronizationJobStatusInfo;
import com.aliyuncs.dts.model.v20200101.DescribeSynchronizationJobStatusListResponse.SynchronizationJobStatusInfo.SynchronizationDirectionInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSynchronizationJobStatusListResponseUnmarshaller {

	public static DescribeSynchronizationJobStatusListResponse unmarshall(DescribeSynchronizationJobStatusListResponse describeSynchronizationJobStatusListResponse, UnmarshallerContext _ctx) {
		
		describeSynchronizationJobStatusListResponse.setRequestId(_ctx.stringValue("DescribeSynchronizationJobStatusListResponse.RequestId"));
		describeSynchronizationJobStatusListResponse.setErrCode(_ctx.stringValue("DescribeSynchronizationJobStatusListResponse.ErrCode"));
		describeSynchronizationJobStatusListResponse.setErrMessage(_ctx.stringValue("DescribeSynchronizationJobStatusListResponse.ErrMessage"));
		describeSynchronizationJobStatusListResponse.setPageNumber(_ctx.integerValue("DescribeSynchronizationJobStatusListResponse.PageNumber"));
		describeSynchronizationJobStatusListResponse.setPageRecordCount(_ctx.integerValue("DescribeSynchronizationJobStatusListResponse.PageRecordCount"));
		describeSynchronizationJobStatusListResponse.setSuccess(_ctx.stringValue("DescribeSynchronizationJobStatusListResponse.Success"));
		describeSynchronizationJobStatusListResponse.setTotalRecordCount(_ctx.longValue("DescribeSynchronizationJobStatusListResponse.TotalRecordCount"));

		List<SynchronizationJobStatusInfo> synchronizationJobListStatusList = new ArrayList<SynchronizationJobStatusInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSynchronizationJobStatusListResponse.SynchronizationJobListStatusList.Length"); i++) {
			SynchronizationJobStatusInfo synchronizationJobStatusInfo = new SynchronizationJobStatusInfo();
			synchronizationJobStatusInfo.setSynchronizationJobId(_ctx.stringValue("DescribeSynchronizationJobStatusListResponse.SynchronizationJobListStatusList["+ i +"].SynchronizationJobId"));

			List<SynchronizationDirectionInfo> synchronizationDirectionInfoList = new ArrayList<SynchronizationDirectionInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSynchronizationJobStatusListResponse.SynchronizationJobListStatusList["+ i +"].SynchronizationDirectionInfoList.Length"); j++) {
				SynchronizationDirectionInfo synchronizationDirectionInfo = new SynchronizationDirectionInfo();
				synchronizationDirectionInfo.setCheckpoint(_ctx.stringValue("DescribeSynchronizationJobStatusListResponse.SynchronizationJobListStatusList["+ i +"].SynchronizationDirectionInfoList["+ j +"].Checkpoint"));
				synchronizationDirectionInfo.setStatus(_ctx.stringValue("DescribeSynchronizationJobStatusListResponse.SynchronizationJobListStatusList["+ i +"].SynchronizationDirectionInfoList["+ j +"].Status"));
				synchronizationDirectionInfo.setSynchronizationDirection(_ctx.stringValue("DescribeSynchronizationJobStatusListResponse.SynchronizationJobListStatusList["+ i +"].SynchronizationDirectionInfoList["+ j +"].SynchronizationDirection"));

				synchronizationDirectionInfoList.add(synchronizationDirectionInfo);
			}
			synchronizationJobStatusInfo.setSynchronizationDirectionInfoList(synchronizationDirectionInfoList);

			synchronizationJobListStatusList.add(synchronizationJobStatusInfo);
		}
		describeSynchronizationJobStatusListResponse.setSynchronizationJobListStatusList(synchronizationJobListStatusList);
	 
	 	return describeSynchronizationJobStatusListResponse;
	}
}