/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeBackupSetsForSecurityResponse;
import com.aliyuncs.rds.model.v20140815.DescribeBackupSetsForSecurityResponse.Backup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupSetsForSecurityResponseUnmarshaller {

	public static DescribeBackupSetsForSecurityResponse unmarshall(DescribeBackupSetsForSecurityResponse describeBackupSetsForSecurityResponse, UnmarshallerContext context) {
		
		describeBackupSetsForSecurityResponse.setRequestId(context.stringValue("DescribeBackupSetsForSecurityResponse.RequestId"));
		describeBackupSetsForSecurityResponse.setTotalRecordCount(context.stringValue("DescribeBackupSetsForSecurityResponse.TotalRecordCount"));
		describeBackupSetsForSecurityResponse.setPageNumber(context.stringValue("DescribeBackupSetsForSecurityResponse.PageNumber"));
		describeBackupSetsForSecurityResponse.setPageRecordCount(context.stringValue("DescribeBackupSetsForSecurityResponse.PageRecordCount"));
		describeBackupSetsForSecurityResponse.setTotalBackupSize(context.longValue("DescribeBackupSetsForSecurityResponse.TotalBackupSize"));

		List<Backup> items = new ArrayList<Backup>();
		for (int i = 0; i < context.lengthValue("DescribeBackupSetsForSecurityResponse.Items.Length"); i++) {
			Backup backup = new Backup();
			backup.setBackupId(context.stringValue("DescribeBackupSetsForSecurityResponse.Items["+ i +"].BackupId"));
			backup.setDBInstanceId(context.stringValue("DescribeBackupSetsForSecurityResponse.Items["+ i +"].DBInstanceId"));
			backup.setBackupStatus(context.stringValue("DescribeBackupSetsForSecurityResponse.Items["+ i +"].BackupStatus"));
			backup.setBackupStartTime(context.stringValue("DescribeBackupSetsForSecurityResponse.Items["+ i +"].BackupStartTime"));
			backup.setBackupEndTime(context.stringValue("DescribeBackupSetsForSecurityResponse.Items["+ i +"].BackupEndTime"));
			backup.setBackupType(context.stringValue("DescribeBackupSetsForSecurityResponse.Items["+ i +"].BackupType"));
			backup.setBackupMode(context.stringValue("DescribeBackupSetsForSecurityResponse.Items["+ i +"].BackupMode"));
			backup.setBackupMethod(context.stringValue("DescribeBackupSetsForSecurityResponse.Items["+ i +"].BackupMethod"));
			backup.setBackupDownloadURL(context.stringValue("DescribeBackupSetsForSecurityResponse.Items["+ i +"].BackupDownloadURL"));
			backup.setBackupIntranetDownloadURL(context.stringValue("DescribeBackupSetsForSecurityResponse.Items["+ i +"].BackupIntranetDownloadURL"));
			backup.setBackupLocation(context.stringValue("DescribeBackupSetsForSecurityResponse.Items["+ i +"].BackupLocation"));
			backup.setBackupExtractionStatus(context.stringValue("DescribeBackupSetsForSecurityResponse.Items["+ i +"].BackupExtractionStatus"));
			backup.setBackupScale(context.stringValue("DescribeBackupSetsForSecurityResponse.Items["+ i +"].BackupScale"));
			backup.setBackupDBNames(context.stringValue("DescribeBackupSetsForSecurityResponse.Items["+ i +"].BackupDBNames"));
			backup.setTotalBackupSize(context.longValue("DescribeBackupSetsForSecurityResponse.Items["+ i +"].TotalBackupSize"));
			backup.setBackupSize(context.longValue("DescribeBackupSetsForSecurityResponse.Items["+ i +"].BackupSize"));
			backup.setHostInstanceID(context.stringValue("DescribeBackupSetsForSecurityResponse.Items["+ i +"].HostInstanceID"));
			backup.setStoreStatus(context.stringValue("DescribeBackupSetsForSecurityResponse.Items["+ i +"].StoreStatus"));

			items.add(backup);
		}
		describeBackupSetsForSecurityResponse.setItems(items);
	 
	 	return describeBackupSetsForSecurityResponse;
	}
}