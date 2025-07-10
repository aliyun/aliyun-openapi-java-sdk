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

package com.aliyuncs.gpdb.model.v20160503;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.DescribeHadoopDataSourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHadoopDataSourceResponse extends AcsResponse {

	private String dataSourceId;

	private String requestId;

	private String dataSourceName;

	private String dataSourceDescription;

	private String dataSourceStatus;

	private String dataSourceDir;

	private String statusMessage;

	private String createTime;

	private String dataSourceType;

	private String hadoopCreateType;

	private String hadoopHostsAddress;

	private String hadoopCoreConf;

	private String hDFSConf;

	private String hiveConf;

	private String yarnConf;

	private String mapReduceConf;

	private String emrInstanceId;

	private String modifyTime;

	private String externalDataServiceId;

	public String getDataSourceId() {
		return this.dataSourceId;
	}

	public void setDataSourceId(String dataSourceId) {
		this.dataSourceId = dataSourceId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDataSourceName() {
		return this.dataSourceName;
	}

	public void setDataSourceName(String dataSourceName) {
		this.dataSourceName = dataSourceName;
	}

	public String getDataSourceDescription() {
		return this.dataSourceDescription;
	}

	public void setDataSourceDescription(String dataSourceDescription) {
		this.dataSourceDescription = dataSourceDescription;
	}

	public String getDataSourceStatus() {
		return this.dataSourceStatus;
	}

	public void setDataSourceStatus(String dataSourceStatus) {
		this.dataSourceStatus = dataSourceStatus;
	}

	public String getDataSourceDir() {
		return this.dataSourceDir;
	}

	public void setDataSourceDir(String dataSourceDir) {
		this.dataSourceDir = dataSourceDir;
	}

	public String getStatusMessage() {
		return this.statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getDataSourceType() {
		return this.dataSourceType;
	}

	public void setDataSourceType(String dataSourceType) {
		this.dataSourceType = dataSourceType;
	}

	public String getHadoopCreateType() {
		return this.hadoopCreateType;
	}

	public void setHadoopCreateType(String hadoopCreateType) {
		this.hadoopCreateType = hadoopCreateType;
	}

	public String getHadoopHostsAddress() {
		return this.hadoopHostsAddress;
	}

	public void setHadoopHostsAddress(String hadoopHostsAddress) {
		this.hadoopHostsAddress = hadoopHostsAddress;
	}

	public String getHadoopCoreConf() {
		return this.hadoopCoreConf;
	}

	public void setHadoopCoreConf(String hadoopCoreConf) {
		this.hadoopCoreConf = hadoopCoreConf;
	}

	public String getHDFSConf() {
		return this.hDFSConf;
	}

	public void setHDFSConf(String hDFSConf) {
		this.hDFSConf = hDFSConf;
	}

	public String getHiveConf() {
		return this.hiveConf;
	}

	public void setHiveConf(String hiveConf) {
		this.hiveConf = hiveConf;
	}

	public String getYarnConf() {
		return this.yarnConf;
	}

	public void setYarnConf(String yarnConf) {
		this.yarnConf = yarnConf;
	}

	public String getMapReduceConf() {
		return this.mapReduceConf;
	}

	public void setMapReduceConf(String mapReduceConf) {
		this.mapReduceConf = mapReduceConf;
	}

	public String getEmrInstanceId() {
		return this.emrInstanceId;
	}

	public void setEmrInstanceId(String emrInstanceId) {
		this.emrInstanceId = emrInstanceId;
	}

	public String getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getExternalDataServiceId() {
		return this.externalDataServiceId;
	}

	public void setExternalDataServiceId(String externalDataServiceId) {
		this.externalDataServiceId = externalDataServiceId;
	}

	@Override
	public DescribeHadoopDataSourceResponse getInstance(UnmarshallerContext context) {
		return	DescribeHadoopDataSourceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
