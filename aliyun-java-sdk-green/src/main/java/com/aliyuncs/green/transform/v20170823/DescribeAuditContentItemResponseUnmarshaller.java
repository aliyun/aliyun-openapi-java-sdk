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

package com.aliyuncs.green.transform.v20170823;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.green.model.v20170823.DescribeAuditContentItemResponse;
import com.aliyuncs.green.model.v20170823.DescribeAuditContentItemResponse.AuditContentItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAuditContentItemResponseUnmarshaller {

	public static DescribeAuditContentItemResponse unmarshall(DescribeAuditContentItemResponse describeAuditContentItemResponse, UnmarshallerContext _ctx) {
		
		describeAuditContentItemResponse.setRequestId(_ctx.stringValue("DescribeAuditContentItemResponse.RequestId"));
		describeAuditContentItemResponse.setPageSize(_ctx.integerValue("DescribeAuditContentItemResponse.PageSize"));
		describeAuditContentItemResponse.setCurrentPage(_ctx.integerValue("DescribeAuditContentItemResponse.CurrentPage"));
		describeAuditContentItemResponse.setTotalCount(_ctx.integerValue("DescribeAuditContentItemResponse.TotalCount"));

		List<AuditContentItem> auditContentItemList = new ArrayList<AuditContentItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAuditContentItemResponse.AuditContentItemList.Length"); i++) {
			AuditContentItem auditContentItem = new AuditContentItem();
			auditContentItem.setParentTaskId(_ctx.stringValue("DescribeAuditContentItemResponse.AuditContentItemList["+ i +"].ParentTaskId"));
			auditContentItem.setContent(_ctx.stringValue("DescribeAuditContentItemResponse.AuditContentItemList["+ i +"].Content"));
			auditContentItem.setSn(_ctx.integerValue("DescribeAuditContentItemResponse.AuditContentItemList["+ i +"].Sn"));
			auditContentItem.setStartTime(_ctx.stringValue("DescribeAuditContentItemResponse.AuditContentItemList["+ i +"].StartTime"));
			auditContentItem.setEndTime(_ctx.stringValue("DescribeAuditContentItemResponse.AuditContentItemList["+ i +"].EndTime"));
			auditContentItem.setAudit(_ctx.integerValue("DescribeAuditContentItemResponse.AuditContentItemList["+ i +"].Audit"));
			auditContentItem.setAuditResult(_ctx.stringValue("DescribeAuditContentItemResponse.AuditContentItemList["+ i +"].AuditResult"));
			auditContentItem.setSuggestion(_ctx.stringValue("DescribeAuditContentItemResponse.AuditContentItemList["+ i +"].Suggestion"));
			auditContentItem.setId(_ctx.longValue("DescribeAuditContentItemResponse.AuditContentItemList["+ i +"].Id"));

			List<String> auditIllegalReasons = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAuditContentItemResponse.AuditContentItemList["+ i +"].AuditIllegalReasons.Length"); j++) {
				auditIllegalReasons.add(_ctx.stringValue("DescribeAuditContentItemResponse.AuditContentItemList["+ i +"].AuditIllegalReasons["+ j +"]"));
			}
			auditContentItem.setAuditIllegalReasons(auditIllegalReasons);

			auditContentItemList.add(auditContentItem);
		}
		describeAuditContentItemResponse.setAuditContentItemList(auditContentItemList);
	 
	 	return describeAuditContentItemResponse;
	}
}