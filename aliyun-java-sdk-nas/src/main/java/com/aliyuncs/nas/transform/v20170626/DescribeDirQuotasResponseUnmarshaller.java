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

package com.aliyuncs.nas.transform.v20170626;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nas.model.v20170626.DescribeDirQuotasResponse;
import com.aliyuncs.nas.model.v20170626.DescribeDirQuotasResponse.DirQuotaInfo;
import com.aliyuncs.nas.model.v20170626.DescribeDirQuotasResponse.DirQuotaInfo.UserQuotaInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDirQuotasResponseUnmarshaller {

	public static DescribeDirQuotasResponse unmarshall(DescribeDirQuotasResponse describeDirQuotasResponse, UnmarshallerContext _ctx) {
		
		describeDirQuotasResponse.setRequestId(_ctx.stringValue("DescribeDirQuotasResponse.RequestId"));
		describeDirQuotasResponse.setTotalCount(_ctx.integerValue("DescribeDirQuotasResponse.TotalCount"));
		describeDirQuotasResponse.setPageSize(_ctx.integerValue("DescribeDirQuotasResponse.PageSize"));
		describeDirQuotasResponse.setPageNumber(_ctx.integerValue("DescribeDirQuotasResponse.PageNumber"));

		List<DirQuotaInfo> dirQuotaInfos = new ArrayList<DirQuotaInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDirQuotasResponse.DirQuotaInfos.Length"); i++) {
			DirQuotaInfo dirQuotaInfo = new DirQuotaInfo();
			dirQuotaInfo.setPath(_ctx.stringValue("DescribeDirQuotasResponse.DirQuotaInfos["+ i +"].Path"));
			dirQuotaInfo.setDirInode(_ctx.stringValue("DescribeDirQuotasResponse.DirQuotaInfos["+ i +"].DirInode"));
			dirQuotaInfo.setStatus(_ctx.stringValue("DescribeDirQuotasResponse.DirQuotaInfos["+ i +"].Status"));

			List<UserQuotaInfo> userQuotaInfos = new ArrayList<UserQuotaInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDirQuotasResponse.DirQuotaInfos["+ i +"].UserQuotaInfos.Length"); j++) {
				UserQuotaInfo userQuotaInfo = new UserQuotaInfo();
				userQuotaInfo.setUserType(_ctx.stringValue("DescribeDirQuotasResponse.DirQuotaInfos["+ i +"].UserQuotaInfos["+ j +"].UserType"));
				userQuotaInfo.setUserId(_ctx.stringValue("DescribeDirQuotasResponse.DirQuotaInfos["+ i +"].UserQuotaInfos["+ j +"].UserId"));
				userQuotaInfo.setQuotaType(_ctx.stringValue("DescribeDirQuotasResponse.DirQuotaInfos["+ i +"].UserQuotaInfos["+ j +"].QuotaType"));
				userQuotaInfo.setSizeLimit(_ctx.longValue("DescribeDirQuotasResponse.DirQuotaInfos["+ i +"].UserQuotaInfos["+ j +"].SizeLimit"));
				userQuotaInfo.setSizeReal(_ctx.longValue("DescribeDirQuotasResponse.DirQuotaInfos["+ i +"].UserQuotaInfos["+ j +"].SizeReal"));
				userQuotaInfo.setFileCountLimit(_ctx.longValue("DescribeDirQuotasResponse.DirQuotaInfos["+ i +"].UserQuotaInfos["+ j +"].FileCountLimit"));
				userQuotaInfo.setFileCountReal(_ctx.longValue("DescribeDirQuotasResponse.DirQuotaInfos["+ i +"].UserQuotaInfos["+ j +"].FileCountReal"));

				userQuotaInfos.add(userQuotaInfo);
			}
			dirQuotaInfo.setUserQuotaInfos(userQuotaInfos);

			dirQuotaInfos.add(dirQuotaInfo);
		}
		describeDirQuotasResponse.setDirQuotaInfos(dirQuotaInfos);
	 
	 	return describeDirQuotasResponse;
	}
}