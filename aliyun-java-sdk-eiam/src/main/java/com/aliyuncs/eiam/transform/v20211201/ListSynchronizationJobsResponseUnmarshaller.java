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

package com.aliyuncs.eiam.transform.v20211201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eiam.model.v20211201.ListSynchronizationJobsResponse;
import com.aliyuncs.eiam.model.v20211201.ListSynchronizationJobsResponse.SynchronizationJob;
import com.aliyuncs.eiam.model.v20211201.ListSynchronizationJobsResponse.SynchronizationJob.Result;
import com.aliyuncs.eiam.model.v20211201.ListSynchronizationJobsResponse.SynchronizationJob.Result.GroupMemberStatistics;
import com.aliyuncs.eiam.model.v20211201.ListSynchronizationJobsResponse.SynchronizationJob.Result.GroupMemberStatistics.Binded15;
import com.aliyuncs.eiam.model.v20211201.ListSynchronizationJobsResponse.SynchronizationJob.Result.GroupMemberStatistics.Created13;
import com.aliyuncs.eiam.model.v20211201.ListSynchronizationJobsResponse.SynchronizationJob.Result.GroupMemberStatistics.Deleted16;
import com.aliyuncs.eiam.model.v20211201.ListSynchronizationJobsResponse.SynchronizationJob.Result.GroupMemberStatistics.Pushed18;
import com.aliyuncs.eiam.model.v20211201.ListSynchronizationJobsResponse.SynchronizationJob.Result.GroupMemberStatistics.Same17;
import com.aliyuncs.eiam.model.v20211201.ListSynchronizationJobsResponse.SynchronizationJob.Result.GroupMemberStatistics.Updated14;
import com.aliyuncs.eiam.model.v20211201.ListSynchronizationJobsResponse.SynchronizationJob.Result.GroupStatistics;
import com.aliyuncs.eiam.model.v20211201.ListSynchronizationJobsResponse.SynchronizationJob.Result.GroupStatistics.Binded9;
import com.aliyuncs.eiam.model.v20211201.ListSynchronizationJobsResponse.SynchronizationJob.Result.GroupStatistics.Created7;
import com.aliyuncs.eiam.model.v20211201.ListSynchronizationJobsResponse.SynchronizationJob.Result.GroupStatistics.Deleted10;
import com.aliyuncs.eiam.model.v20211201.ListSynchronizationJobsResponse.SynchronizationJob.Result.GroupStatistics.Pushed12;
import com.aliyuncs.eiam.model.v20211201.ListSynchronizationJobsResponse.SynchronizationJob.Result.GroupStatistics.Same11;
import com.aliyuncs.eiam.model.v20211201.ListSynchronizationJobsResponse.SynchronizationJob.Result.GroupStatistics.Updated8;
import com.aliyuncs.eiam.model.v20211201.ListSynchronizationJobsResponse.SynchronizationJob.Result.OrganizationalUnitStatistics;
import com.aliyuncs.eiam.model.v20211201.ListSynchronizationJobsResponse.SynchronizationJob.Result.OrganizationalUnitStatistics.Binded3;
import com.aliyuncs.eiam.model.v20211201.ListSynchronizationJobsResponse.SynchronizationJob.Result.OrganizationalUnitStatistics.Created1;
import com.aliyuncs.eiam.model.v20211201.ListSynchronizationJobsResponse.SynchronizationJob.Result.OrganizationalUnitStatistics.Deleted4;
import com.aliyuncs.eiam.model.v20211201.ListSynchronizationJobsResponse.SynchronizationJob.Result.OrganizationalUnitStatistics.Pushed6;
import com.aliyuncs.eiam.model.v20211201.ListSynchronizationJobsResponse.SynchronizationJob.Result.OrganizationalUnitStatistics.Same5;
import com.aliyuncs.eiam.model.v20211201.ListSynchronizationJobsResponse.SynchronizationJob.Result.OrganizationalUnitStatistics.Updated2;
import com.aliyuncs.eiam.model.v20211201.ListSynchronizationJobsResponse.SynchronizationJob.Result.UserStatistics;
import com.aliyuncs.eiam.model.v20211201.ListSynchronizationJobsResponse.SynchronizationJob.Result.UserStatistics.Binded;
import com.aliyuncs.eiam.model.v20211201.ListSynchronizationJobsResponse.SynchronizationJob.Result.UserStatistics.Created;
import com.aliyuncs.eiam.model.v20211201.ListSynchronizationJobsResponse.SynchronizationJob.Result.UserStatistics.Deleted;
import com.aliyuncs.eiam.model.v20211201.ListSynchronizationJobsResponse.SynchronizationJob.Result.UserStatistics.Exported;
import com.aliyuncs.eiam.model.v20211201.ListSynchronizationJobsResponse.SynchronizationJob.Result.UserStatistics.Pushed;
import com.aliyuncs.eiam.model.v20211201.ListSynchronizationJobsResponse.SynchronizationJob.Result.UserStatistics.Same;
import com.aliyuncs.eiam.model.v20211201.ListSynchronizationJobsResponse.SynchronizationJob.Result.UserStatistics.Updated;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSynchronizationJobsResponseUnmarshaller {

	public static ListSynchronizationJobsResponse unmarshall(ListSynchronizationJobsResponse listSynchronizationJobsResponse, UnmarshallerContext _ctx) {
		
		listSynchronizationJobsResponse.setRequestId(_ctx.stringValue("ListSynchronizationJobsResponse.RequestId"));
		listSynchronizationJobsResponse.setTotalCount(_ctx.longValue("ListSynchronizationJobsResponse.TotalCount"));
		listSynchronizationJobsResponse.setNextToken(_ctx.stringValue("ListSynchronizationJobsResponse.NextToken"));

		List<SynchronizationJob> synchronizationJobs = new ArrayList<SynchronizationJob>();
		for (int i = 0; i < _ctx.lengthValue("ListSynchronizationJobsResponse.SynchronizationJobs.Length"); i++) {
			SynchronizationJob synchronizationJob = new SynchronizationJob();
			synchronizationJob.setSynchronizationJobId(_ctx.stringValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].SynchronizationJobId"));
			synchronizationJob.setTargetType(_ctx.stringValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].TargetType"));
			synchronizationJob.setTargetId(_ctx.stringValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].TargetId"));
			synchronizationJob.setDirection(_ctx.stringValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Direction"));
			synchronizationJob.setStartTime(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].StartTime"));
			synchronizationJob.setEndTime(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].EndTime"));
			synchronizationJob.setTriggerType(_ctx.stringValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].TriggerType"));
			synchronizationJob.setStatus(_ctx.stringValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Status"));
			synchronizationJob.setDescription(_ctx.stringValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Description"));

			Result result = new Result();
			result.setErrorMessage(_ctx.stringValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.ErrorMessage"));
			result.setErrorCode(_ctx.stringValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.ErrorCode"));

			UserStatistics userStatistics = new UserStatistics();

			Created created = new Created();
			created.setTotal(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.UserStatistics.Created.Total"));
			created.setSuccess(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.UserStatistics.Created.Success"));
			created.setFailed(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.UserStatistics.Created.Failed"));
			created.setSkipped(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.UserStatistics.Created.Skipped"));
			userStatistics.setCreated(created);

			Updated updated = new Updated();
			updated.setTotal(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.UserStatistics.Updated.Total"));
			updated.setSuccess(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.UserStatistics.Updated.Success"));
			updated.setFailed(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.UserStatistics.Updated.Failed"));
			updated.setSkipped(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.UserStatistics.Updated.Skipped"));
			userStatistics.setUpdated(updated);

			Binded binded = new Binded();
			binded.setTotal(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.UserStatistics.Binded.Total"));
			binded.setSuccess(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.UserStatistics.Binded.Success"));
			binded.setFailed(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.UserStatistics.Binded.Failed"));
			binded.setSkipped(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.UserStatistics.Binded.Skipped"));
			userStatistics.setBinded(binded);

			Deleted deleted = new Deleted();
			deleted.setTotal(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.UserStatistics.Deleted.Total"));
			deleted.setSuccess(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.UserStatistics.Deleted.Success"));
			deleted.setFailed(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.UserStatistics.Deleted.Failed"));
			deleted.setSkipped(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.UserStatistics.Deleted.Skipped"));
			userStatistics.setDeleted(deleted);

			Same same = new Same();
			same.setTotal(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.UserStatistics.Same.Total"));
			same.setSuccess(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.UserStatistics.Same.Success"));
			same.setFailed(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.UserStatistics.Same.Failed"));
			same.setSkipped(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.UserStatistics.Same.Skipped"));
			userStatistics.setSame(same);

			Pushed pushed = new Pushed();
			pushed.setTotal(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.UserStatistics.Pushed.Total"));
			pushed.setSuccess(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.UserStatistics.Pushed.Success"));
			pushed.setFailed(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.UserStatistics.Pushed.Failed"));
			pushed.setSkipped(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.UserStatistics.Pushed.Skipped"));
			userStatistics.setPushed(pushed);

			Exported exported = new Exported();
			exported.setTotal(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.UserStatistics.Exported.Total"));
			exported.setSuccess(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.UserStatistics.Exported.Success"));
			exported.setFailed(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.UserStatistics.Exported.Failed"));
			exported.setSkipped(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.UserStatistics.Exported.Skipped"));
			userStatistics.setExported(exported);
			result.setUserStatistics(userStatistics);

			OrganizationalUnitStatistics organizationalUnitStatistics = new OrganizationalUnitStatistics();

			Created1 created1 = new Created1();
			created1.setTotal(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.OrganizationalUnitStatistics.Created.Total"));
			created1.setSuccess(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.OrganizationalUnitStatistics.Created.Success"));
			created1.setFailed(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.OrganizationalUnitStatistics.Created.Failed"));
			created1.setSkipped(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.OrganizationalUnitStatistics.Created.Skipped"));
			organizationalUnitStatistics.setCreated1(created1);

			Updated2 updated2 = new Updated2();
			updated2.setTotal(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.OrganizationalUnitStatistics.Updated.Total"));
			updated2.setSuccess(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.OrganizationalUnitStatistics.Updated.Success"));
			updated2.setFailed(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.OrganizationalUnitStatistics.Updated.Failed"));
			updated2.setSkipped(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.OrganizationalUnitStatistics.Updated.Skipped"));
			organizationalUnitStatistics.setUpdated2(updated2);

			Binded3 binded3 = new Binded3();
			binded3.setTotal(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.OrganizationalUnitStatistics.Binded.Total"));
			binded3.setSuccess(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.OrganizationalUnitStatistics.Binded.Success"));
			binded3.setFailed(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.OrganizationalUnitStatistics.Binded.Failed"));
			binded3.setSkipped(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.OrganizationalUnitStatistics.Binded.Skipped"));
			organizationalUnitStatistics.setBinded3(binded3);

			Deleted4 deleted4 = new Deleted4();
			deleted4.setTotal(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.OrganizationalUnitStatistics.Deleted.Total"));
			deleted4.setSuccess(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.OrganizationalUnitStatistics.Deleted.Success"));
			deleted4.setFailed(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.OrganizationalUnitStatistics.Deleted.Failed"));
			deleted4.setSkipped(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.OrganizationalUnitStatistics.Deleted.Skipped"));
			organizationalUnitStatistics.setDeleted4(deleted4);

			Same5 same5 = new Same5();
			same5.setTotal(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.OrganizationalUnitStatistics.Same.Total"));
			same5.setSuccess(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.OrganizationalUnitStatistics.Same.Success"));
			same5.setFailed(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.OrganizationalUnitStatistics.Same.Failed"));
			same5.setSkipped(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.OrganizationalUnitStatistics.Same.Skipped"));
			organizationalUnitStatistics.setSame5(same5);

			Pushed6 pushed6 = new Pushed6();
			pushed6.setTotal(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.OrganizationalUnitStatistics.Pushed.Total"));
			pushed6.setSuccess(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.OrganizationalUnitStatistics.Pushed.Success"));
			pushed6.setFailed(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.OrganizationalUnitStatistics.Pushed.Failed"));
			pushed6.setSkipped(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.OrganizationalUnitStatistics.Pushed.Skipped"));
			organizationalUnitStatistics.setPushed6(pushed6);
			result.setOrganizationalUnitStatistics(organizationalUnitStatistics);

			GroupStatistics groupStatistics = new GroupStatistics();

			Created7 created7 = new Created7();
			created7.setTotal(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupStatistics.Created.Total"));
			created7.setSuccess(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupStatistics.Created.Success"));
			created7.setFailed(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupStatistics.Created.Failed"));
			created7.setSkipped(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupStatistics.Created.Skipped"));
			groupStatistics.setCreated7(created7);

			Updated8 updated8 = new Updated8();
			updated8.setTotal(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupStatistics.Updated.Total"));
			updated8.setSuccess(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupStatistics.Updated.Success"));
			updated8.setFailed(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupStatistics.Updated.Failed"));
			updated8.setSkipped(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupStatistics.Updated.Skipped"));
			groupStatistics.setUpdated8(updated8);

			Binded9 binded9 = new Binded9();
			binded9.setTotal(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupStatistics.Binded.Total"));
			binded9.setSuccess(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupStatistics.Binded.Success"));
			binded9.setFailed(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupStatistics.Binded.Failed"));
			binded9.setSkipped(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupStatistics.Binded.Skipped"));
			groupStatistics.setBinded9(binded9);

			Deleted10 deleted10 = new Deleted10();
			deleted10.setTotal(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupStatistics.Deleted.Total"));
			deleted10.setSuccess(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupStatistics.Deleted.Success"));
			deleted10.setFailed(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupStatistics.Deleted.Failed"));
			deleted10.setSkipped(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupStatistics.Deleted.Skipped"));
			groupStatistics.setDeleted10(deleted10);

			Same11 same11 = new Same11();
			same11.setTotal(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupStatistics.Same.Total"));
			same11.setSuccess(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupStatistics.Same.Success"));
			same11.setFailed(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupStatistics.Same.Failed"));
			same11.setSkipped(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupStatistics.Same.Skipped"));
			groupStatistics.setSame11(same11);

			Pushed12 pushed12 = new Pushed12();
			pushed12.setTotal(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupStatistics.Pushed.Total"));
			pushed12.setSuccess(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupStatistics.Pushed.Success"));
			pushed12.setFailed(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupStatistics.Pushed.Failed"));
			pushed12.setSkipped(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupStatistics.Pushed.Skipped"));
			groupStatistics.setPushed12(pushed12);
			result.setGroupStatistics(groupStatistics);

			GroupMemberStatistics groupMemberStatistics = new GroupMemberStatistics();

			Created13 created13 = new Created13();
			created13.setTotal(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupMemberStatistics.Created.Total"));
			created13.setSuccess(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupMemberStatistics.Created.Success"));
			created13.setFailed(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupMemberStatistics.Created.Failed"));
			created13.setSkipped(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupMemberStatistics.Created.Skipped"));
			groupMemberStatistics.setCreated13(created13);

			Updated14 updated14 = new Updated14();
			updated14.setTotal(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupMemberStatistics.Updated.Total"));
			updated14.setSuccess(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupMemberStatistics.Updated.Success"));
			updated14.setFailed(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupMemberStatistics.Updated.Failed"));
			updated14.setSkipped(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupMemberStatistics.Updated.Skipped"));
			groupMemberStatistics.setUpdated14(updated14);

			Binded15 binded15 = new Binded15();
			binded15.setTotal(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupMemberStatistics.Binded.Total"));
			binded15.setSuccess(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupMemberStatistics.Binded.Success"));
			binded15.setFailed(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupMemberStatistics.Binded.Failed"));
			binded15.setSkipped(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupMemberStatistics.Binded.Skipped"));
			groupMemberStatistics.setBinded15(binded15);

			Deleted16 deleted16 = new Deleted16();
			deleted16.setTotal(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupMemberStatistics.Deleted.Total"));
			deleted16.setSuccess(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupMemberStatistics.Deleted.Success"));
			deleted16.setFailed(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupMemberStatistics.Deleted.Failed"));
			deleted16.setSkipped(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupMemberStatistics.Deleted.Skipped"));
			groupMemberStatistics.setDeleted16(deleted16);

			Same17 same17 = new Same17();
			same17.setTotal(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupMemberStatistics.Same.Total"));
			same17.setSuccess(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupMemberStatistics.Same.Success"));
			same17.setFailed(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupMemberStatistics.Same.Failed"));
			same17.setSkipped(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupMemberStatistics.Same.Skipped"));
			groupMemberStatistics.setSame17(same17);

			Pushed18 pushed18 = new Pushed18();
			pushed18.setTotal(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupMemberStatistics.Pushed.Total"));
			pushed18.setSuccess(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupMemberStatistics.Pushed.Success"));
			pushed18.setFailed(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupMemberStatistics.Pushed.Failed"));
			pushed18.setSkipped(_ctx.longValue("ListSynchronizationJobsResponse.SynchronizationJobs["+ i +"].Result.GroupMemberStatistics.Pushed.Skipped"));
			groupMemberStatistics.setPushed18(pushed18);
			result.setGroupMemberStatistics(groupMemberStatistics);
			synchronizationJob.setResult(result);

			synchronizationJobs.add(synchronizationJob);
		}
		listSynchronizationJobsResponse.setSynchronizationJobs(synchronizationJobs);
	 
	 	return listSynchronizationJobsResponse;
	}
}