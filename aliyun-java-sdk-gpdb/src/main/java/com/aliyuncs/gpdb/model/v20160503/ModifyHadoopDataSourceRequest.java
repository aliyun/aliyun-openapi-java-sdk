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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.gpdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyHadoopDataSourceRequest extends RpcAcsRequest<ModifyHadoopDataSourceResponse> {
	   

	private String dataSourceType;

	private String hadoopCreateType;

	private String yarnConf;

	private String dataSourceDescription;

	private String emrInstanceId;

	private String hiveConf;

	private String hDFSConf;

	private String dBInstanceId;

	private String mapReduceConf;

	private String hadoopHostsAddress;

	private String hadoopCoreConf;

	private String dataSourceId;
	public ModifyHadoopDataSourceRequest() {
		super("gpdb", "2016-05-03", "ModifyHadoopDataSource", "gpdb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDataSourceType() {
		return this.dataSourceType;
	}

	public void setDataSourceType(String dataSourceType) {
		this.dataSourceType = dataSourceType;
		if(dataSourceType != null){
			putQueryParameter("DataSourceType", dataSourceType);
		}
	}

	public String getHadoopCreateType() {
		return this.hadoopCreateType;
	}

	public void setHadoopCreateType(String hadoopCreateType) {
		this.hadoopCreateType = hadoopCreateType;
		if(hadoopCreateType != null){
			putQueryParameter("HadoopCreateType", hadoopCreateType);
		}
	}

	public String getYarnConf() {
		return this.yarnConf;
	}

	public void setYarnConf(String yarnConf) {
		this.yarnConf = yarnConf;
		if(yarnConf != null){
			putQueryParameter("YarnConf", yarnConf);
		}
	}

	public String getDataSourceDescription() {
		return this.dataSourceDescription;
	}

	public void setDataSourceDescription(String dataSourceDescription) {
		this.dataSourceDescription = dataSourceDescription;
		if(dataSourceDescription != null){
			putQueryParameter("DataSourceDescription", dataSourceDescription);
		}
	}

	public String getEmrInstanceId() {
		return this.emrInstanceId;
	}

	public void setEmrInstanceId(String emrInstanceId) {
		this.emrInstanceId = emrInstanceId;
		if(emrInstanceId != null){
			putQueryParameter("EmrInstanceId", emrInstanceId);
		}
	}

	public String getHiveConf() {
		return this.hiveConf;
	}

	public void setHiveConf(String hiveConf) {
		this.hiveConf = hiveConf;
		if(hiveConf != null){
			putQueryParameter("HiveConf", hiveConf);
		}
	}

	public String getHDFSConf() {
		return this.hDFSConf;
	}

	public void setHDFSConf(String hDFSConf) {
		this.hDFSConf = hDFSConf;
		if(hDFSConf != null){
			putQueryParameter("HDFSConf", hDFSConf);
		}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public String getMapReduceConf() {
		return this.mapReduceConf;
	}

	public void setMapReduceConf(String mapReduceConf) {
		this.mapReduceConf = mapReduceConf;
		if(mapReduceConf != null){
			putQueryParameter("MapReduceConf", mapReduceConf);
		}
	}

	public String getHadoopHostsAddress() {
		return this.hadoopHostsAddress;
	}

	public void setHadoopHostsAddress(String hadoopHostsAddress) {
		this.hadoopHostsAddress = hadoopHostsAddress;
		if(hadoopHostsAddress != null){
			putQueryParameter("HadoopHostsAddress", hadoopHostsAddress);
		}
	}

	public String getHadoopCoreConf() {
		return this.hadoopCoreConf;
	}

	public void setHadoopCoreConf(String hadoopCoreConf) {
		this.hadoopCoreConf = hadoopCoreConf;
		if(hadoopCoreConf != null){
			putQueryParameter("HadoopCoreConf", hadoopCoreConf);
		}
	}

	public String getDataSourceId() {
		return this.dataSourceId;
	}

	public void setDataSourceId(String dataSourceId) {
		this.dataSourceId = dataSourceId;
		if(dataSourceId != null){
			putQueryParameter("DataSourceId", dataSourceId);
		}
	}

	@Override
	public Class<ModifyHadoopDataSourceResponse> getResponseClass() {
		return ModifyHadoopDataSourceResponse.class;
	}

}
