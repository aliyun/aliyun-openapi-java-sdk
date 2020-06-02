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

package com.aliyuncs.cr.transform.v20181201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cr.model.v20181201.ListRepoBuildRecordResponse;
import com.aliyuncs.cr.model.v20181201.ListRepoBuildRecordResponse.BuildRecordsItem;
import com.aliyuncs.cr.model.v20181201.ListRepoBuildRecordResponse.BuildRecordsItem.Image;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRepoBuildRecordResponseUnmarshaller {

	public static ListRepoBuildRecordResponse unmarshall(ListRepoBuildRecordResponse listRepoBuildRecordResponse, UnmarshallerContext _ctx) {
		
		listRepoBuildRecordResponse.setRequestId(_ctx.stringValue("ListRepoBuildRecordResponse.RequestId"));
		listRepoBuildRecordResponse.setIsSuccess(_ctx.booleanValue("ListRepoBuildRecordResponse.IsSuccess"));
		listRepoBuildRecordResponse.setCode(_ctx.stringValue("ListRepoBuildRecordResponse.Code"));
		listRepoBuildRecordResponse.setPageNo(_ctx.integerValue("ListRepoBuildRecordResponse.PageNo"));
		listRepoBuildRecordResponse.setPageSize(_ctx.integerValue("ListRepoBuildRecordResponse.PageSize"));
		listRepoBuildRecordResponse.setTotalCount(_ctx.stringValue("ListRepoBuildRecordResponse.TotalCount"));

		List<BuildRecordsItem> buildRecords = new ArrayList<BuildRecordsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRepoBuildRecordResponse.BuildRecords.Length"); i++) {
			BuildRecordsItem buildRecordsItem = new BuildRecordsItem();
			buildRecordsItem.setBuildRecordId(_ctx.stringValue("ListRepoBuildRecordResponse.BuildRecords["+ i +"].BuildRecordId"));
			buildRecordsItem.setStartTime(_ctx.stringValue("ListRepoBuildRecordResponse.BuildRecords["+ i +"].StartTime"));
			buildRecordsItem.setEndTime(_ctx.stringValue("ListRepoBuildRecordResponse.BuildRecords["+ i +"].EndTime"));
			buildRecordsItem.setBuildStatus(_ctx.stringValue("ListRepoBuildRecordResponse.BuildRecords["+ i +"].BuildStatus"));

			Image image = new Image();
			image.setRepoId(_ctx.stringValue("ListRepoBuildRecordResponse.BuildRecords["+ i +"].Image.RepoId"));
			image.setRepoNamespaceName(_ctx.stringValue("ListRepoBuildRecordResponse.BuildRecords["+ i +"].Image.RepoNamespaceName"));
			image.setRepoName(_ctx.stringValue("ListRepoBuildRecordResponse.BuildRecords["+ i +"].Image.RepoName"));
			image.setImageTag(_ctx.stringValue("ListRepoBuildRecordResponse.BuildRecords["+ i +"].Image.ImageTag"));
			buildRecordsItem.setImage(image);

			buildRecords.add(buildRecordsItem);
		}
		listRepoBuildRecordResponse.setBuildRecords(buildRecords);
	 
	 	return listRepoBuildRecordResponse;
	}
}