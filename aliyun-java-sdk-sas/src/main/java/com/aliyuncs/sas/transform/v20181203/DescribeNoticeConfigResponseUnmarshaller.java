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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeNoticeConfigResponse;
import com.aliyuncs.sas.model.v20181203.DescribeNoticeConfigResponse.NoticeConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNoticeConfigResponseUnmarshaller {

	public static DescribeNoticeConfigResponse unmarshall(DescribeNoticeConfigResponse describeNoticeConfigResponse, UnmarshallerContext _ctx) {
		
		describeNoticeConfigResponse.setRequestId(_ctx.stringValue("DescribeNoticeConfigResponse.RequestId"));

		List<NoticeConfig> noticeConfigList = new ArrayList<NoticeConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNoticeConfigResponse.NoticeConfigList.Length"); i++) {
			NoticeConfig noticeConfig = new NoticeConfig();
			noticeConfig.setTimeLimit(_ctx.integerValue("DescribeNoticeConfigResponse.NoticeConfigList["+ i +"].TimeLimit"));
			noticeConfig.setRoute(_ctx.integerValue("DescribeNoticeConfigResponse.NoticeConfigList["+ i +"].Route"));
			noticeConfig.setProject(_ctx.stringValue("DescribeNoticeConfigResponse.NoticeConfigList["+ i +"].Project"));
			noticeConfig.setAliUid(_ctx.longValue("DescribeNoticeConfigResponse.NoticeConfigList["+ i +"].AliUid"));
			noticeConfig.setCurrentPage(_ctx.integerValue("DescribeNoticeConfigResponse.NoticeConfigList["+ i +"].CurrentPage"));

			noticeConfigList.add(noticeConfig);
		}
		describeNoticeConfigResponse.setNoticeConfigList(noticeConfigList);
	 
	 	return describeNoticeConfigResponse;
	}
}