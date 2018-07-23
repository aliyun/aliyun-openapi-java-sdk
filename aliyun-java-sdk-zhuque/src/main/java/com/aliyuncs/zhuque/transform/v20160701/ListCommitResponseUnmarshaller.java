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

package com.aliyuncs.zhuque.transform.v20160701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.zhuque.model.v20160701.ListCommitResponse;
import com.aliyuncs.zhuque.model.v20160701.ListCommitResponse.CommitItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCommitResponseUnmarshaller {

	public static ListCommitResponse unmarshall(ListCommitResponse listCommitResponse, UnmarshallerContext context) {
		
		listCommitResponse.setRequestId(context.stringValue("ListCommitResponse.RequestId"));
		listCommitResponse.setResult(context.stringValue("ListCommitResponse.Result"));
		listCommitResponse.setMessage(context.stringValue("ListCommitResponse.Message"));

		List<CommitItem> commit = new ArrayList<CommitItem>();
		for (int i = 0; i < context.lengthValue("ListCommitResponse.Commit.Length"); i++) {
			CommitItem commitItem = new CommitItem();
			commitItem.setCloudType(context.stringValue("ListCommitResponse.Commit["+ i +"].CloudType"));
			commitItem.setDescription(context.stringValue("ListCommitResponse.Commit["+ i +"].Description"));
			commitItem.setTags(context.stringValue("ListCommitResponse.Commit["+ i +"].Tags"));
			commitItem.setTimestamp(context.stringValue("ListCommitResponse.Commit["+ i +"].Timestamp"));
			commitItem.setType(context.stringValue("ListCommitResponse.Commit["+ i +"].Type"));
			commitItem.setVersion(context.stringValue("ListCommitResponse.Commit["+ i +"].Version"));

			commit.add(commitItem);
		}
		listCommitResponse.setCommit(commit);
	 
	 	return listCommitResponse;
	}
}